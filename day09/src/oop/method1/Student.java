package oop.method1;

public class Student {
	//member field : 클래스로 만든 객체의 구성요소
	//데이터 저장소
	String name;
	int score;
	
	//member method : 코드 저장소
	// - 메소드에서 this는 "자신"을 의미
	/*void 이름() {
		코드
	}*/
	//설정 메소드(코드 저장소)
	// - 실행하려면 String과 int를 하나씩 전달해야 하는 메소드
	// - 외부에서 전달된 값을 저장하는 변수를 "매개변수"라고 합니다.
	void setting(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//출력 메소드(코드 저장소)
	void print() {
		System.out.println("이름 : "+this.name);
		System.out.println("점수 : "+this.score+"점");
	}
}
