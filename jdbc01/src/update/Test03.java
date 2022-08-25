package update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정보를 수정할 회원의 번호 : ");
		int number = sc.nextInt();
		System.out.print("마일리지의 수량 : ");
		int mileage = sc.nextInt();
		sc.close();
		
		String sql = "update customer set "
				+ "client_mileage = client_mileage + ? "
				+ "where client_no = ?";
		Object[] param = {mileage, number};
		
		int result = template.update(sql, param);
		if(result > 0) {
			System.out.println("완료");
		}else {
			System.out.println("실패");
		}
		
	}
}
