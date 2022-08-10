package oop.poly1;

public class Test01 {
	public static void main(String[] args) {
		//정적 객체 생성
		GalaxyFold3 a = new GalaxyFold3();
		//a.samsungPay();
		a.call();
	
		//동적 객체 생성
		//상속 관계일 때 가능
		Phone b = new GalaxyFold3();
		//b.samsungPay();
		b.call();
		
		Phone c = new IPhone13();
		c.call();
		
	}
}
