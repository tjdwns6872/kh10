package oop.method6;

public class Goods {
	String name;
	String type;
	int price;
	boolean send;
	String ox;
	String delivery;
	int sale;
	
	void setting(String name, String type, int price, boolean send, String ox) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.send = send;
		this.ox = ox;
	}
	void calculation() {
		if(send == true) {
			this.delivery = "2500원";
		}else {
			this.delivery = "불가능";
		}if(this.ox == "행사중") {
			this.sale = price * (100-10)/100;
		}else {
			this.sale = price;
		}
		
	}
	
	void print() {
		System.out.println("상품명 : "+this.name);
		System.out.println("상품분류 : "+this.type);
		System.out.println("판매가 : "+this.sale);
		System.out.println("새벽배송 : "+this.delivery);
		System.out.println("행사여부 : "+this.ox);
		System.out.println("---------------------------------");
	}
}
