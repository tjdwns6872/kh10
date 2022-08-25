package update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 정보의 번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 작성자 : ");
		String name = sc.nextLine();
		System.out.print("수정할 메모 : ");
		String memo = sc.nextLine();
		sc.close();
		
		String sql = "update guest_book set name = ?, memo = ? where no = ?";
		Object[] param = {name, memo, number};
		
		int result = template.update(sql, param);
		
		if(result > 0) {
			System.out.println("완료");
		}else {
			System.out.println("실패");
		}
	}
}
