package oop.getter3;

public class Student {
	String name;
	int grade;
	int korean;
	int english;
	int math;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		if(grade >= 1 && grade <= 3) {
			this.grade = grade;
		}
	}
	int getKorean() {
		return korean;
	}
	void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
	int getEnglish() {
		return english;
	}
	void setEnglish(int english) {
		if(english >= 0 && english <= 100) {
			this.english = english;
		}
	}
	int getMath() {
		return math;
	}
	void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;
		}
	}
	Student(String name, int grade, int korean, int english, int math){
		this.setName(name);
		this.setGrade(grade);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	int getTotal() {
		return this.korean + this.english + this.math;
	}
	double getAverage(){
		return this.getTotal() / 3.0;
	}
	String getEvaluation() {
		if(this.getAverage() >= 90) {
			return "A";
		}else if(this.getAverage() >= 80) {
			return "B";
		}else if(this.getAverage() >= 70) {
			return "C";
		}else {
			return "F";
		}
	}
	
	void print(){
		System.out.println("< 학생 성적 정보 >");
		System.out.println("이름 : "+this.name);
		System.out.println("학년 : "+this.grade+"학년");
		System.out.println("국어점수 : "+this.korean+"점");
		System.out.println("영어점수 : "+this.english+"점");
		System.out.println("수학점수 : "+this.math+"점");
		System.out.println("총 점수 : "+this.getTotal()+"점");
		System.out.println("평균 점수 : "+this.getAverage()+"점");
		System.out.println("학점 : "+this.getEvaluation());
		System.out.println("===========================");
	}	
}