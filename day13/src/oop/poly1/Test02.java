package oop.poly1;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		//랜덤으로 휴대폰 1개를 만들어서 통화 기능을 실행
		// [약속] 0 - 갤럭시폴드3, 1 - 아이폰13
		Random rand = new Random();
		int choice = rand.nextInt(2);
		
		if(choice == 0) {
			GalaxyFold3 a = new GalaxyFold3(); 
			a.call();
		}else {
			IPhone13 b = new IPhone13();
			b.call();
		}
		
	}
}
