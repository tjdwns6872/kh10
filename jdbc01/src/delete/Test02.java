package delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		//delete customer where client_no = ?
		Scanner sc = new Scanner(System.in);
		JdbcTemplate template = JdbcUtil.getTemplate();
		System.out.print("삭제 할 게시물에 번호 : ");
		int number = sc.nextInt();
		sc.close();
		
		String sql = "delete customer where client_no = ?";
		Object[] param = {number};
		
		int result = template.update(sql, param);
		
		if(result > 0) {
			System.out.println("삭제가 완료 되었습니다.");
		}else {
			System.out.println("존재하지 않는 게시물 입니다.");
		}
		
	}
}
