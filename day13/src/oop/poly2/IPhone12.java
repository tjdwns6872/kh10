package oop.poly2;

public class IPhone12 extends Phone{

	@Override
	public void filming() {
		System.out.println("아이폰12의 사진 촬영 기능을 실행합니다.");
		
	}

	@Override
	public void gallery() {
		System.out.println("아이폰12의 갤러리 기능을 실행합니다.");
		
	}

	@Override
	public void call() {
		System.out.println("아이폰12의 통화 기능을 실행합니다.");
		
	}

	@Override
	public void sms() {
		System.out.println("아이폰12의 문자 기능을 실행합니다.");
		
	}

}
