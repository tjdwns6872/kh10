package oop.poly2;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		/*사용자에게 Scanner를 이용하여 휴대폰 종류를 입력받는다
		 * 갤럭시22s
		 * 갤럭시폴드3
		 * 아이폰12
		 * 아이폰13
		 * 사용자에게 Scanner를 이용하여 수행할 작업의 종류를 입력받는다.
		 * 사진촬영
		 * 갤러리보기
		 * 통화
		 * 문자
		 * 모든 종류의 휴대폰은 다음 기능들을 가지고 있다.
		 * 사진촬영(camera)
		 * 갤러리보기(gallery)
		 * 통화(call)
		 * 문자(sms)
		 * 모든 메소드는 다음과 같은 형태로 출력되어야 한다
		 * ex : 아이폰12 선택 후 사진촬영 선택 시 아이폰12의 사진촬영 기능 실행 메세지 출력
		 * 이 문제는 다형성을 이용해도 풀리고, 이용하지 않아도 풀린다.
		 * 상위 클래스는 원하는대로 구현*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("휴대폰의 종류 : ");
		String type = sc.next();
		System.out.print("이용할 기능 : ");
		String function = sc.next();
		
		//업캐스팅 하위요소를 상위형태로 보관
		//Phone phone;
		Phone phone = null;
		
		if(type.equals("아이폰13")) {
			phone = new IPhone13();
		}else if(type.equals("아이폰12")) {
			phone = new IPhone12();
		}else if(type.equals("갤럭시22s")) {
			phone = new Galaxy22s();
		}else if(type.equals("갤럭시폴드3")) {
			phone = new GalaxyFold3();
		}/*else {
			return;
		}*/
		
		if(function.equals("사진촬영")) {
			phone.filming();
		}else if(function.equals("갤러리보기")) {
			phone.gallery();
		}else if(function.equals("통화")) {
			phone.call();
		}else if(function.equals("문자")) {
			phone.sms();
		}/*else {
			return;
		}*/		
		sc.close();
	}
}