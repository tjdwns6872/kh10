package oop.method3_1;
public class Test01 {

	public static void main(String[] args) {
		Name na = new Name();
		Name na1 = new Name();
		Name na2 = new Name();
		
		na.setting("피카츄", 90, 90, 85);
		na1.setting("라이츄", 80, 90, 85);
		na2.setting("꼬부기", 100, 90, 90);
		
		na.print();
		na1.print();
		na2.print();
	}
}
