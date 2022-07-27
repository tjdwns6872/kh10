package data;
import java.lang.*;
public class Test16 {
	public static void main(String[] args) {
		//문자열(String)
		// -""를 이용해서 글자를 저장
		// -크기는 만들어봐야 알 수 있다.(주문제작 형태)
		// -참조형 데이터(reference type)
		// -부가적인 명령들을 사용할 수 있다.
		
		String a = "hello";
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		
		// -문자열은 덧셈이 가능하다.
		System.out.println("hello "+"world");
		
		int money = 500;
		System.out.println("소지금은 "+money+"원 입니다.");
		
		// -출력이 되지 않는 특이한 형태의 글자들이 있다.
		
		//escape 문자
		// -\t : tab
		// -\n : new line(enter)
		//String b = "가	나	다	라	마";
		//String b = "가\t나\t다\t라\t마";
		String b = "가\n나\n다\n라\n마";
		System.out.println(b);
		
		//문자열 변수를 만들어 다음 글자를 저장 후 출력
		// -나는 지금 "피자"가 먹고 싶어요
		
		String c = "나는 지금 \"피자\"가 먹고 싶어요";
		System.out.println(c);
		
		String d = "D:\\study";
		System.out.println(d);
	}
}
