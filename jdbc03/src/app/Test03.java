package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		/*사용자에게 음원번호를 입력받아 
		 * 해당하는 음원번호의 재생 수를 1 증가시키는 프로그램을 구현*/
		
		Scanner sc = new Scanner(System.in);
		JdbcTemplate template = JdbcUtil.getTemplate();
		System.out.print("듣고 싶은 노래의 번호를 입력하세요 : ");
		int no = sc.nextInt();
		
		String sql = "update music set music_play = music_play+1 where music_no = ?";
		Object[] param = {no};
		
		int result = template.update(sql, param);
		if(result > 0) {
			System.out.println(no+"번에 해당하는 노래를 재생합니다.");
		}else {
			System.out.println("존재하지 않은 노래 번호 입니다.");
		}
		
		sc.close();
	}
}
