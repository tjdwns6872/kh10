package oop.method3_1;

public class Name {
	//멤버 필드 - 객체의 필요한 데이터 저장
	String name;
	int korean;
	int english;
	int math;
	
	//설정 메소드
	void setting(String name, int korean, int english, 
					int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//출력 메소드
	void print() {	
		double total;
		double ave;
		total = this.korean+this.english+this.math;
		ave = total/3;
		System.out.println(this.name+" "+this.korean+" "+this.english+" "+
								this.math+" "+total+" "+ave);
		System.out.println("--------------------------------------------------");
	}
}
