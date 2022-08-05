package oop.constructor1;
public class Test01 {

	public static void main(String[] args) {
		Student a = new Student("피카츄", 50);
//		a.setting("피카츄", 50);
		a.print();
		
		Student b = new Student("라이츄");
		b.print();
	}
}