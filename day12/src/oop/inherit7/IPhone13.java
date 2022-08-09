package oop.inherit7;

public class IPhone13 extends IPhone{

	public IPhone13(String name, String color) {
		super(name, color);
	}

	@Override
	public void siri() {
		System.out.println("아이폰13 음성인식 실행");
	}

	@Override
	public void call() {
		System.out.println("아이폰13 전화 실행");
	}

	@Override
	public void sms() {
		System.out.println("아이폰13 문자 실행");
	}
	public void faceTime() {
		System.out.println("아이폰13 영상통화 실행");
	}
	
}
