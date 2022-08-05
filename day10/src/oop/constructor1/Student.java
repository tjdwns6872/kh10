package oop.constructor1;
public class Student {
	String name;
	int score;
	
	//생성자(Constructor)
	// - 객체 생성 시 반드시 실행되는 구문
	// - 메소드와 구조가 같지만 생성시에만 딱 한번 실행
	//  - void와 같은 키워드를 적을 수 없다(반환형)
	// - 생성자도 오버로딩이 가능하다.
	// - 클래스와 동일한 이름을 가진다.
	Student(String name){
		this.name = name;
	}
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void print() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
