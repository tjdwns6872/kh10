package oop.keyword10;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		//값을 미리 정해둔다!
		//[약속] 0 : 앞, 1 : 뒤)
		final int front = 0, back = 1;
				
		//동전 던지기
		Random rand = new Random();
		int coin = rand.nextInt(2); 
	
		if(coin == front) {
			System.out.println("앞");
		}else {
			System.out.println("뒤");
		}
	}
}
