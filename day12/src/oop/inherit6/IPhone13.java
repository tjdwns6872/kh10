package oop.inherit6;

public class IPhone13 extends IPhone{
	public IPhone13(String number, String color) {
		super(number, color);
	}
	public void call() {
		System.out.println("아이폰13 전화 기능 실행");
	}
	public void sms() {
		System.out.println("아이폰13 문자 기능 실행");
	}
	public void siri() {
		System.out.println("아이폰13 음성인식 기능 실행");
	}
	public void faceTime() {
		System.out.println("아이폰13 영상통화 기능 실행");
	}
}
