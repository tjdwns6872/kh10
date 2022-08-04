package oop.method5;

public class Phone {
	String name;
	String telecom;
	int price;
	int agreement;
	double monPrice;
	int sale;
	String a;
	
	void setting(String name, String telecom, int price, int agreement) {
		this.name = name;
		this.telecom = telecom;
		this.price = price;
		this.agreement = agreement;
	}
	
	void calculation() {
		if(agreement > 0) {
			this.monPrice = (this.price / (double)this.agreement)*10000;
			this.monPrice = ((int)monPrice/100)*100;
			this.sale = this.price;
		}else {
			this.sale = this.price*(100-5)/100;
		}	
	}
	void print() {
		System.out.println("이름 : "+this.name);
		System.out.println("통신사 : "+this.telecom);
		
		if(this.agreement <= 0) {
			this.a ="약정없음";
			System.out.println("가격 : "+this.sale+"만원");
			System.out.println("약정개월 : "+a);
		}else {
			System.out.println("가격 : "+this.price+"만원");
			System.out.println("약정개월 : "+this.agreement+"개월");
			System.out.println("월 할부금 : "+(int)this.monPrice+"원");
		}
		System.out.println("----------------------------------------");
	}
}
