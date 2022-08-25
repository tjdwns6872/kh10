package insert;

import java.util.Scanner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class Test04 {
	/* 포켓몬스터 테이블(pocket_monster) 테이블에 데이터를 등록할 수 있도록 구현 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("포켓몬의 번호 : ");
		int number = sc.nextInt();
		System.out.print("포켓몬의 이름 : ");
		String name = sc.next();
		System.out.print("포켓몬의 타입 : ");
		String type = sc.next();
		
		sc.close();
		Object[] param = new Object[] {number, name, type};
		
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("c##khacademy"); 
		dataSource.setPassword("c##khacademy"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "insert into pocket_monster(no, name, type) values(?, ?, ?)"; //? -> 위치 홀더
		template.update(sql, param);
		System.out.println("완료");
	}
}
