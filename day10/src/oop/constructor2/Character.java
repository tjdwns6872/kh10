package oop.constructor2;

public class Character {
	//field
	String id;
	String job;
	int level;
	
	//constructor
	
	//기본 생성자
	// - 클래스는 객체를 만들기 위해 존재한다.
	// - 생성자를 안만들어도 하나는 만들어준다.
	// - 마음에 안들면 다른 생성자를 만든다.
	//Character(){}
	
	//생성자 오버로딩
	Character(String id, String job){
		this(id, job, 1);
	}
	Character(String id, String job, int level){
		this.id = id;
		this.job = job;
		this.level = level;
	}
	void levelUp() {
		this.level++;
		//그 외 추가 작업 코드
	}
	
	//method
	void print(){
		System.out.println("< 캐릭터 정보 >");
		System.out.println("아이디 : "+this.id);
		System.out.println("직업 : "+this.job);
		System.out.println("레벨 : "+this.level);
		System.out.println("-------------------");
	}
}
