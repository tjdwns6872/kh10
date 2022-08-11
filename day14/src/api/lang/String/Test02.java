package api.lang.String;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		/*사용자에게 아이디와 비밀번호를 입력받아서 로그인을 처리하는 프로그램을 구현
		 * 아이디는 khacademy, 비밀번호는 student일 경우에만 로그인 성공 메세지 출력
		 * 그 외는 로그인 불가 메세지 출력
		 * (추가) 허용 아이디와 비밀번호 개수를 늘려보세요*/
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		sc.close();
		String useId = "khacademy";
		String usePw = "student";
		
		if(id.equals(useId) && pw.equals(usePw)) {
			System.out.println("로그인 성공");	
		}else {
			System.out.println("로그인 불가");
		}		
	}
}