package oop.setter1;

public class Car {
	//field
	String name;
	int speed;
	int passenger;
	int price;

	//setter method
	// - 이름을 지을 때 set+변수명으로 작성
	// - 담당부서 느낌
	void setName(String name) {
		this.name = name;
	}
	void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;			
		}
	}		
	void setPassenger(int passenger) {
//		[1] passenger가 0보다 클 경우에만 설정하세요
//			if(passenger > 0) {
//				this.passenger = passenger;
//		}
//		[2] passenger가 0보다 작거나 같을 경우에만 설정하세요
//		if(passenger <= 0) {
//			this.passenger = passenger;
//		}
		if(passenger > 0) {
			this.passenger = passenger;
		}
//		this.passenger = passenger;
	}
	void setPrice(int price) {
		if(price > 1000000) {
			this.price = price;
		}
	}
	void print(){
		System.out.println(" < 차량 정보 > ");
		System.out.println("차량 이름 : "+this.name);
		System.out.println("차량의 속도 : "+this.speed);
		System.out.println("탑승가능 인원 : "+this.passenger);
		System.out.println("차량의 가격 : "+this.price);
	}
	
	Car(String name, int speed, int passenger, int price){
		this.setName(name);
		this.setSpeed(speed);
		this.setPassenger(passenger);
		this.setPrice(price);
	}
}
