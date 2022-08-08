package oop.keyword10;
import java.util.*;
public class Test03 {
	//외부에서 부를 수 있도록 필드로 선언한다.
	// - 객체 없이 편하게 부르라고 static 처리, 변경 없으니 안전하게 쓰라고 final 처리
	// - 접근 제한도 public으로 설정한다.
	// - 상수(constant)라고 부른다.
	// [약속] 0 : 앞, 1 : 뒤)
	public static final int FRONT = 0, BACK = 1;
	
	public static void main(String[] args) {
		//동전 던지기
		Random rand = new Random();
		int coin = rand.nextInt(2); 
	
		if(coin == FRONT) {
			System.out.println("앞");
		}else {
			System.out.println("뒤");
		}
	}
}
