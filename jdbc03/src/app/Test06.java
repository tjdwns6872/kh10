package app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.MusicDto;
import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색어 : ");
		String search = sc.nextLine();
		
		String sql = "select * from music where instr(music_title, ?) > 0";	
		String sql1 = "select * from music where instr(music_artist, ?) > 0";
		String sql2 = "select * from music where instr(music_album, ?) > 0";
		Object[] param = {search};
		
		RowMapper<MusicDto> mapper = new RowMapper<MusicDto>() {
			
			@Override
			public MusicDto mapRow(ResultSet rs, int idx) throws SQLException {
				MusicDto dto = new MusicDto();
				dto.setMusicNo(rs.getInt("music_no"));
				dto.setMusicTitle(rs.getString("music_title"));
				dto.setMusicArtist(rs.getString("music_artist"));
				dto.setMusicAlbum(rs.getString("music_album"));
				dto.setMusicPlay(rs.getInt("music_play"));
				dto.setReleaseTime(rs.getNString("release_time"));
				return dto;
			}
		};
		List<MusicDto> list = template.query(sql, mapper, param);
		System.out.println("=========타이틀 관련 검색 결과=========");
		for(MusicDto dto : list) {
			System.out.println(dto);
		}
		List<MusicDto> list1 = template.query(sql1, mapper, param);
		System.out.println("=========가수 관련 검색 결과=========");
		for(MusicDto dto : list1) {
			System.out.println(dto);
		}
		List<MusicDto> list2 = template.query(sql2, mapper, param);
		System.out.println("=========앨범 관련 검색 결과=========");
		for(MusicDto dto : list2) {
			System.out.println(dto);
		}
		sc.close();
	}
}
