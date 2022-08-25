package delete;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//삭제(delete)
		//delete fifa where country = ?;
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String country = "스페인";
		
		String sql = "delete fifa where country = ?";
		Object[] param = {country};
		
		int result = template.update(sql, param);
		if(result > 0) {
			System.out.println("완료");
		}else {
			System.out.println("존재하지 않는 나라 이름입니다.");
		}
	}
}
