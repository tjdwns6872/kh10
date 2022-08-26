package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test04 {
	public static void main(String[] args) {
		/*사용자에게 음원번호를 입력받아 
		 * 해당하는 음원을 삭제하는 프로그램 구현*/
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제하실 노래의 번호를 입력하세요 : ");
		int no = sc.nextInt();
		
		String sql = "delete music where music_no = ?";
		Object[] param = {no};
		
		int result = template.update(sql, param);
		if(result > 0) {
			System.out.println(no+"번의 노래를 성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재하지 않은 노래의 번호 입니다.");
		}
		sc.close();
	}
}
