package oop.method2;
public class Name {
	//멤버 필드
	//멤버 메소드
	String name;
	String event;
	String type;
	int gold;
	int silver;
	int dong;
	
	//설정 메소드
	void setting(String name, String event, String type, 
					int gold, int silver, int dong) {
	this.name = name;
	this.event = event;
	this.type = type;
	this.gold = gold;
	this.silver = silver;
	this.dong = dong;
	}
	
	//출력 메소드
	void print() {
		System.out.println(this.name+" "+this.event+" "+this.type+" "
							+this.gold+" "+this.silver+" "+this.dong);
		System.out.println("-----------------------------------------");
	}
}