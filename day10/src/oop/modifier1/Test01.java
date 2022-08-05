package oop.modifier1;

public class Test01 {

	public static void main(String[] args) {
		Student a = new Student("홍길동", 50);

		//a.score = 60; //접근불가(사용불가)
		a.setScore(-60);//접근 허용(사용 가능)
		a.print();
	}

}
