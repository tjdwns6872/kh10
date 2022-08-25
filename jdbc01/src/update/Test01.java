package update;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		// 수정(Update)
		// - 조건에 따라 실행결과 개수가 달라지므로 이를 받아서 성공/실패를 판단
		// update fifa set score=1755.23 where country = '아르헨티나'
		JdbcTemplate template = JdbcUtil.getTemplate();
		double score = 1755.23;
		String nation = "아르헨티나";
		
		String sql = "update fifa set score = ? where country = ?";
		Object[] param = {score, nation};
		
		int result = template.update(sql, param);
		if(result > 0) {
			System.out.println("변경 성공");			
		}else {
			System.out.println("해당하는 나라가 없습니다.");
		}
		
	}
}
