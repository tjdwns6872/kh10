package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
		/*guest_book 테이블의 모든 데이터를 최신순으로 출력
		 * 단, 클래스명은 GuestBookDto 라고 하세요
		 * 필드명은 데이터베이스 컬럼명과 동일하게 작성하세요*/
		// select * from guest_book
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		String sql = "select * from guest_book order by no desc";
		RowMapper<GuestBookDto> mapper = new RowMapper<GuestBookDto>() {

			@Override
			public GuestBookDto mapRow(ResultSet rs, int idx) throws SQLException {
				GuestBookDto dto = new GuestBookDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setMemo(rs.getString("memo"));
				return dto;
			}
		};
		
		List<GuestBookDto> list = template.query(sql, mapper);
		System.out.println("=========방명록==========");
		for(GuestBookDto dto : list) {
			System.out.print("번호 : "+dto.getNo());
			System.out.print(", 이름 : "+dto.getName());
			System.out.print(", 내용 : "+dto.getMemo());
			System.out.println();
		}
		
	}
}
