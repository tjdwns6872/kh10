package oop.setter2;

public class Lecture {
	//필드
	String name;
	int time;
	int price;
	String type;
	
	//생성자
	Lecture(String name, int time, int price, String type){
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	//set메소드
	void setName(String name) {
		this.name = name;
	}
	void setTime(int time) {
	//	[1]
		if(time % 30 == 0 && time > 0) {
			this.time = time;
		}
	// [2] 
	/* if(time <= 0){
	 * 		return;
	 * }if(time % 30 == 0){
	 * 		return;
	 * }
	 *  this.time = time;*/
	}
	void setPrice(int price) {
		if(price > 0) {
			this.price = price;
		}
	}
	//tip : 문자열 비교 연산이 힘들다(안될 경우가 존재)
	void setType(String type) {
		//[1]
		if(type.equals("온라인") || type.equals("오프라인") || type.equals("혼합")) {
			this.type = type;
		}
		//[2] 구분(type)을 int형으로 받아서 
		//0 = 온라인, 1 = 오프라인, 2 = 혼합으로 받고
		//type가 0보다 크거나 같고 3보다 작을 때만 this.type = type 실행.
		
		//[3] switch(type) 사용
	}
	//출력 메소드
	void print() {
		System.out.println("< 학원 강의 요금표 >");
		System.out.println("강좌명 : "+this.name);
		System.out.println("강의시간 : "+this.time+"시간");
		System.out.println("수강료 : "+this.price+"원");
		System.out.println("구분 : "+this.type);
		System.out.println("--------------------------");
	}
}
