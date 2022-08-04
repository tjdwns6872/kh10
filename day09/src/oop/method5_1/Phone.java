package oop.method5_1;

public class Phone {
	String name;
	String telecom;
	int price;
	int month;
	
	void setting(String name, String telecom, int price, int month) {
		this.name = name;
		this.telecom = telecom;
		if(price >= 0) {			
			this.price = price;
		}
		switch(month) {
		case 0:
		case 24:
		case 30:
		case 36:
			this.month = month;
		}
	}
	void setting(String name, String telecom, int price) {

		this.setting(name, telecom, price, 0);
	}
	
	void print() {
		if(this.month > 0) {
			int pricePerMith = this.price/this.month;
			System.out.println("이름 : "+this.name);
			System.out.println("통신사 : "+this.telecom);
			System.out.println("가격 : "+this.price+"원(월"+pricePerMith+"원)");
			System.out.println("-----------------------------------------------------");
			
		}else {
			int discountPrice =this.price*(100-5)/100;
			System.out.println("이름 : "+this.name);
			System.out.println("통신사 : "+this.telecom);
			System.out.println("가격 : "+discountPrice+"원 (원 가격은 "+this.price+"원)");
			System.out.println("약정 없음");
			System.out.println("-----------------------------------------------------");
		}
	}
}
