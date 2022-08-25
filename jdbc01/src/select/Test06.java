package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
		/*customer 테이블의 *모든* 데이터를 번호순으로 출력
		 * 단, 클래스명은 CustomerDto 라고 하세요
		 * 필드명은 데이터베이스 컬럼명과 동일하게 작성하세요*/
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from customer order by client_no asc";
		
		RowMapper<CustomerDto> mapper = new RowMapper<CustomerDto>() {
			
			@Override
			public CustomerDto mapRow(ResultSet rs, int idx) throws SQLException {
				CustomerDto dto = new CustomerDto();
				dto.setClient_no(rs.getInt("client_no"));
				dto.setClient_id(rs.getString("client_id"));
				dto.setClient_phone(rs.getString("client_phone"));
				dto.setClient_date(rs.getString("client_date"));
				dto.setClient_lastdate(rs.getString("client_lastdate"));
				dto.setClient_mileage(rs.getInt("client_mileage"));
				dto.setClient_rank(rs.getString("client_rank"));
				return dto;
			}
		};
		List<CustomerDto> list = template.query(sql, mapper);
		for(CustomerDto dto : list) {
			System.out.println(dto);
		}
		
		
	}
}
