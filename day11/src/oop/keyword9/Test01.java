package oop.keyword9;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		/*사용자에게 정보를 입력받아 회원가입을 하는 프로그램을 구현
		 * 사용자에게 입력받는 정보는 아이디, 비밀번호, 닉네임 총 세 가지
		 * 아이디는 한 번 설정되면 변경이 불가능
		 * 비밀번호와 닉네임은 변경이 가능
		 * 비밀번호는 정보 출력 시 출력되지 않아야 함
		 * 사용자에게 정보를 입력받아 회원 객체를 생성하고 정보를 출력*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("< 회원가입 >");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		System.out.print("닉네임을 입력하세요 : ");
		String nickname = sc.next();
		User u = new User(id, pw, nickname);
		
		u.print();
		
		sc.close();
	}
}
