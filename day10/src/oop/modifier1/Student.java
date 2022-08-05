package oop.modifier1;

public class Student {
	//변수는 외부 접근을 차단하겠다.
	// - private 키워드를 추가
	// - 클래스 외부의 접근을 차단
	private String name;
	private int score;
	
	//메소드는 조건 등이 사용 가능하므로 외부에 공개해야 한다.
	// - public 키워드를 추가
	// - 아무데서나 접근이 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score >= 0 && score <= 100) {
			this.score = score;
		}
	}
	
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
	//생성자는 외부에서 객체를 생성하기 위한 구문이다.
	// - 외부의 접근이 가능하도록 public 으로 설정
	public Student(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
}