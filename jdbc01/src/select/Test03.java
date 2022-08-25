package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		// select는 insert, update, delete와 같은 방법으로는 사용 불가
		// (추가) 
		// - 테이블을 객체 형태로 변환해서 List로 추출해야 한다.
		// - 자바는 테이블의 한 줄이 어떻게 객체에 추가되어야 하는지를 모른다.
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from fifa";
		
		//변경 방법이 작성된 객체를 구현 - RowMapper 클래스 사용
		RowMapper<Country> mapper = new RowMapper<Country>() {
			
			@Override
			public Country mapRow(ResultSet rs, int idx) throws SQLException {
				// rs = 컬럼, idx = 컬럼의 개수
				// rs에 들어있는 데이터를 꺼내서 country로 복사하는 코드
				// - rs에서 데이터를 꺼내는 명령 : rs.getString(), rs.getInt(), ...
				Country c = new Country();
				//c.setNo(rs에 들어있는 데이터 중에서 no 컬럼의 값);
				c.setNo(rs.getInt("no")); //컬럼명
				c.setCountry(rs.getString("country")); // 컬럼명
				c.setScore(rs.getDouble("score")); // 컬럼명
				return c;
			}
		};
		
		List<Country> list = template.query(sql, mapper); 
		for(Country c : list) {
			System.out.println(c.getNo());
			System.out.println(c.getCountry());
			System.out.println(c.getScore());
		}
	}
}

