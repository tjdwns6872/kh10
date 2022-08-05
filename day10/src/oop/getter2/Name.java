package oop.getter2;

public class Name {
	String name;
	String subject;
	int score;
	int check;
	
	//setter/getter
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getSubject() {
		return subject;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	int getScore() {
		return score;
	}
	void setScore(int score) {
		if(score >= 0 && score <= 100) {
			this.score = score;
		}
	}
	int getCheck() {
		return check;
	}
	void setCheck(int check) {
		if(check >= 0 && check <= 100) {
			this.check = check;
		}
	}
	int getTotal() {
		return this.score + this.check;
	}
	
	double getAverage() {
		return this.getTotal()/2.0;
	}
	String getEvaluation() {
		if(this.score >= 40 && this.check >= 40 && this.getAverage() >= 60) {
			return "통과";
		}else {
			return "재평가";
		}
	}
	
	//생성자 오버로딩
	Name(String name, String subject, int score, int check){
		this.setName(name);
		this.setSubject(subject);
		this.setScore(score);
		this.setCheck(check);
	}
	Name(String name, int score, int check){
		this.setName(name);
		this.setSubject("응용SW기초기술활용");
		this.setScore(score);
		this.setCheck(check);
	}
	
	//출력 메소드
	void print() {
		System.out.println("< 평가 결과 정보 >");
		System.out.println("이름 : "+this.name);
		System.out.println("과목 : "+this.subject);
		System.out.println("서술형 점수 : "+this.score);
		System.out.println("평가자 체크리스트 점수 : "+this.check);
		System.out.println("총 점수 : "+this.getTotal());
		System.out.println("평균 점수 : "+this.getAverage());
		System.out.println("통과 여부 : "+this.getEvaluation());
		System.out.println("===========================");
		
	}
}
