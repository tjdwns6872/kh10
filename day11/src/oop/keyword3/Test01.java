package oop.keyword3;

public class Test01 {

	public static void main(String[] args) {
		//System.out.println(3*5);
		
		//static 메소드는 아무데서나 클래스명만 알면 객체 없이 사용이 가능하다.
		System.out.println(Calculator.getAnswer(3, 5));
		System.out.println(Calculator.getAnswer(4, 6));
		

	}
}