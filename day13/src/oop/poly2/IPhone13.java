package oop.poly2;

public class IPhone13 extends Phone{

	@Override
	public void filming() {
		System.out.println("아이폰13의 사진 촬영 기능을 실행합니다.");
		
	}

	@Override
	public void gallery() {
		System.out.println("아이폰13의 갤러리 기능을 실행합니다.");
		
	}

	@Override
	public void call() {
		System.out.println("아이폰13의 전화 기능을 실행합니다.");
		
	}

	@Override
	public void sms() {
		System.out.println("아이폰13의 문자 기능을 실행합니다.");
		
	}

}
