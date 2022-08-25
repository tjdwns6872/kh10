package insert;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		// JDBC(Java DataBase Connectivity)
		// 목표 : khacademy 계정의 FIFA 테이블에 데이터 insert
		// 구문 : insert into fifa(no, country, score)
		// values(4, '아르헨티나', 1770.65);
		
		// 진행순서
		// 1. 데이터베이스 로그인
		// 2. 구문 준비
		// 3. 구문 전송 및 실행
		// 4. 데이터베이스 로그아웃(생략)
		
		//변수
		int rank = 5;
		String nation = "잉글랜드";
		double score = 1720.27;
		
		// 1. 로그인을 도와주는 도구를 생성(Spring 제공)
		// - 드라이버 클래스정보, 접속정보, 계정정보, 비밀번호정보를 설정
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("c##khacademy");
		dataSource.setPassword("c##khacademy");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		// 2.구문 실행 도구 생성(Spring 제공)
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		// 3. 구문 생성
		String sql = "insert into fifa(no, country, score) "
				+ "values("+rank+",'"+nation+"', "+score+")";
		
		// 3. 실행
		template.update(sql);
		
		System.out.println("완료!");
	}
}








