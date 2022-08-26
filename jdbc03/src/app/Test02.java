package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		/*사용자에게 음원타이틀, 가수, 앨범명을 
		 * 변경할 수 있도록 정보를 입력받아서 수정 구현*/
		// 타이틀, 아티스트, 앨범
		JdbcTemplate template = JdbcUtil.getTemplate();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 노래의 번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 타이틀 : ");
		String title = sc.nextLine();
		System.out.print("수정할 아티스트 : ");
		String artist = sc.nextLine();
		System.out.print("수정할 앨범 : ");
		String album = sc.nextLine();
		
		String sql = "update music set "
				+ "music_title = ?, music_artist = ?, music_album = ? "
				+ "where music_no = ?";
		Object[] param = {title, artist, album, no};
		
		int result = template.update(sql, param);

		if(result > 0) {
			System.out.println("정보가 성공적으로 수정되었습니다.");
		}else {
			System.out.println("존재하지 않는 노래의 번호입니다.");
		}
		
		sc.close();
		
	}
}
