package oop.method3;

public class Name {
	//멤버 필드 - 객체의 필요한 데이터 저장
	String name;
	int korean;
	int english;
	int math;
	double total;
	double ave;
	
	//설정 메소드
	void setting(String name, int korean, int english, 
					int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = this.korean+this.english+this.math;
		this.ave = this.total/3;
	}
	
	//출력 메소드
	void print() {	
		System.out.println(this.name+" "+this.korean+" "+this.english+" "+
								this.math+" "+this.total+" "+this.ave);
		System.out.println("--------------------------------------------------");
	}
}
