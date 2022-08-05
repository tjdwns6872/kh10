package oop.modifier2;

public class Student {
	private String name;
	private int grade;
	private int korean;
	private int english;
	private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		if(grade >= 1 && grade <= 3) {
			this.grade = grade;
		}
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		if(korean >= 0 && korean <= 100) {
			this.korean = korean;
		}
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		if(english >= 0 && english <= 100) {
			this.english = english;
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;
		}
	}
	
	public int getTotal() {
		return this.korean + this.english + this.math;
	}
	public double getAverage() {
		return getTotal() / 3.0;
	}
	public String getEvaluation() {
		if(getAverage() >= 90) {
			return "A";
		}else if(getAverage() >= 80) {
			return "B";
		}else if(getAverage() >= 70) {
			return "C";
		}else {
			return "F";
		}
	}
	
	public Student(String name, int grade, int korean, int english, int math){
		this.setName(name);
		this.setGrade(grade);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	public Student() {}

	public void print() {
		System.out.println("< 학생 성적 정보 >");
		System.out.println("이름 : "+this.name);
		System.out.println("학년 : "+this.grade);
		System.out.println("국어점수 : "+this.korean);
		System.out.println("영어점수 : "+this.english);
		System.out.println("수학점수 : "+this.math);
		System.out.println("총 점수 : "+getTotal());
		System.out.println("평균점수 : "+getAverage());
		System.out.println("학점 : "+getEvaluation());
		System.out.println("====================");
	}
}
