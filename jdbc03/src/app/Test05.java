package app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.MusicDto;
import util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
		/*사용자에게 전체 음원 목록을 
		 * 재생수 순으로 출력하도록 구현*/
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "select * from music order by music_play desc";
		
		RowMapper<MusicDto> mapper = new RowMapper<>() {
			
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
		List<MusicDto> list = template.query(sql, mapper);
		for(MusicDto dto : list) {
			System.out.println(dto);
		}
	}
}
