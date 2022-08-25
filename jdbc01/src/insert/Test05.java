package insert;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("내용 : ");
		String memo = sc.next();
		sc.close();
		//String seq = "test_seq.nextval"; error
		Object[] param = new Object[] {/*seq, */name, memo};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("c##khacademy");
		dataSource.setPassword("c##khacademy"); 
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "insert into guest_book (no, name, memo) values(test_seq.nextval, ?, ?)";
		template.update(sql, param);
		
		System.out.println("완료");
		
		
	}
}
