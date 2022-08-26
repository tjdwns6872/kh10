package app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import dto.MusicDto;
import util.JdbcUtil;

public class Test09 {
	public static void main(String[] args) {
		//원하는 노래 한곡에 대한 정보만 출력
		
		int musicNo = 2;
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from music where music_no = ?";
		Object[] param = {musicNo};
		
		ResultSetExtractor<MusicDto> setExtractor = new ResultSetExtractor<MusicDto>() {
			
			@Override
			public MusicDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				// 데이터가 있는 경우와 없는 경우를 구분해서 처리하는 방법을 알려준다.
				if(rs.next()) { //rs에 데이터가 있다면
					MusicDto musicDto = new MusicDto();
					musicDto.setMusicNo(rs.getInt("music_no"));
					musicDto.setMusicTitle(rs.getString("music_title"));
					musicDto.setMusicArtist(rs.getString("music_artist"));
					musicDto.setMusicAlbum(rs.getString("music_album"));
					musicDto.setMusicPlay(rs.getInt("music_play"));
					musicDto.setReleaseTime(rs.getNString("release_time"));
					return musicDto;
				}else {	 //없다면	
					return null;
				}
			}
		};
		MusicDto dto = template.query(sql, setExtractor, param);
		if(dto == null) {
			System.out.println("존재하지 않는 음원");
		}else {			
			System.out.println(dto);
		}
	}
}
