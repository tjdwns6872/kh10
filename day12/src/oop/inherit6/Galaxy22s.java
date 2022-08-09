package oop.inherit6;

public class Galaxy22s extends Galaxy{
	public Galaxy22s(String number, String color) {
		super(number, color);
	}
	@Override //annotation, 명찰 역할(바로 아래 있는 대상의 역할을 정의)
	public void call() {
		System.out.println("갤럭시22s 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시22s 문자 기능 실행");
	}
	@Override
	public void samsungPay() {
		System.out.println("갤럭시22s 삼성페이 기능 실행");
	}
	public void bixby() {
		System.out.println("갤럭시22s 음성인식 기능 실행");
	}
}