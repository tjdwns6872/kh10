package oop.multi2;

public class Kickboard extends Transportation implements Electronic{

	@Override
	public void power() {
		System.out.println("전동킥보드의 전원을 켭니다 / 끕니다.");
		
	}

	@Override
	public void move() {
		System.out.println("전동킥보드가 이동합니다.");
		
	}

}
