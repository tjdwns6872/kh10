package oop.basic1;

public class Test01 {
	public static void main(String[] args) {
		//메세지 1개 생성
		Message a = new Message(); //Message라는 클래스의 객체를 생성한다.
		
		//a, b = Reference 참조변수
		//객체(인스턴스)
		//객체 속성 = 필드(field)
		
		//참고 : 문자열 및 다른 참조형의 초기값이 null(없음)이다.
		a.writer = "초롱초롱 라이언";
		a.content = "오늘 일찍와?";
		a.time = "오후 12:29";
		a.remain = 0;
		
		System.out.println(a.writer);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.remain);
		
		Message b = new Message();
		
		b.writer = "어피치";
		b.content = "아니";
		b.time = "오후 12:32";
		b.remain = 0;
		
		System.out.println(b.writer);
		System.out.println(b.content);
		System.out.println(b.time);
		System.out.println(b.remain);
	}
}