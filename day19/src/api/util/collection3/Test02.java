package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		/*다음 아이디와 비밀번호를 Map에 저장해두고 로그인 프로그램을 구현
		 *아이디 : testuser , 비밀번호 : testuser1234
		 *아이디 : student , 비밀번호 : student1234
		 *아이디 : manager , 비밀번호 : manager1234
		 *요구사항
		 *사용자에게 아이디와 비밀번호를 입력받는다
		 *저장소에 있는 아이디=비밀번호 정보와 일치하는 항목이 있다면 로그인 성공 출력
		 *일치하는 항목이 없으면 로그인 실패 출력*/
		
		Map<String, String> idPw = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		idPw.put("testuser", "testuser1234");
		idPw.put("student", "student1234");
		idPw.put("manager", "manager1234");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		if(idPw.containsKey(id)&&idPw.get(id).equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		sc.close();
		
	}
}
