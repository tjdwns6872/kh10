package oop.poly1;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		//랜덤으로 휴대폰 1개를 만들어서 통화 기능을 실행
		// [약속] 0 - 갤럭시폴드3, 1 - 아이폰13
		Random rand = new Random();
		int choice = rand.nextInt(2);
		
		//Phone phone = 갤럭시 객체 or 아이폰 객체;
		Phone phone;
		if(choice == 0) {
			phone = new GalaxyFold3(); //GalaxyFold3 -> Phone(업캐스팅)
		}else {
			phone = new IPhone13(); //IPhone13 -> Phone(업캐스팅)
		}
		phone.call();		
	}
}
