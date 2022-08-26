package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//사용자에게 필요한 정보를 입력받아 등록하도록 구현
		// 번호, 타이틀, 아티스트, 앨범, ,플레이(입력x), 타임(자동계산)
		JdbcTemplate template = JdbcUtil.getTemplate();
		Scanner sc = new Scanner(System.in);
		System.out.print("등록 하실 타이틀 : ");
		String title = sc.nextLine();
		System.out.print("등록 하실 아티스트 : ");
		String artist = sc.nextLine();
		System.out.print("등록 하실 앨범 : ");
		String album = sc.nextLine();
		
		String sql = "insert into music ("
				+ "music_no, music_title, music_artist, music_album, release_time) "
				+ "values(music_seq.nextval, ?, ?, ?, sysdate)";
		Object[] param = {title, artist, album};
		
		template.update(sql, param);
		System.out.println("등록이 완료 되었습니다.");
		
		
		sc.close();
	}
}
