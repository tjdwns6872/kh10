package api.util.collection;

import java.util.List;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		/*List에 다음 데이터를 추가하고 무작위로 1개를 추첨하도록 구현하시오
		 * 자바, 파이썬, 루비, 안드로이드, 자바스크립트*/
		
		// - 배열처럼 한 번에 데이터까지 초기화하면서 생성
		// Java 8+
		//List<String> list = Arrays.asList("자바", "파이썬", "루비", "안드로이드", "자바스크립트");
		
		// Java 9+
		List<String> list = List.of("자바", "파이썬", "루비", "안드로이드", "자바스크립트");
		
		Random rand = new Random();
		
		/*list.add("자바");
		list.add("파이썬");
		list.add("루비");
		list.add("안드로이드");
		list.add("자바스크립트");*/
		int r = rand.nextInt(list.size());
		System.out.println(list.get(r));
	}
}
