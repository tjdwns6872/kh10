package oop.method4;

public class Menu {
	String name;
	String type;
	int price;
	boolean event;
	String ox;
	
	//method overloading : 같은 이름으로 메소드를 여러 개 준비하는 것
	void setting(String name, String type, int price) {
		this.setting(name, type, price, false);
	}
	void setting(String name, String type, int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;
	}
	
	void eventing() {
		if(event == true) {
			ox = "행사중";
		}else {
			ox = "-";
		}
	}
	
	void print() {
		System.out.println("이름 : "+this.name);
		System.out.println("분류 : "+this.type);
		System.out.println("가격 : "+this.price);
		if(event == true) {
			System.out.println("행사여부 : "+this.ox);			
		}
		System.out.println("------------------------------");
	}
}
