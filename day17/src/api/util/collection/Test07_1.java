package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07_1 {
	public static void main(String[] args) {
		/*이번 주 로또 예상번호를 추첨하여 출력
		 * 단, 번호는 낮은 것부터 출력*/
		
		//2
		List<Integer> list1 = new ArrayList<>();
		for(int i = 1; i < 46; i++) {
			list1.add(i);
		}
		Collections.shuffle(list1);
		List<Integer>num = list1.subList(0, 7);
		Collections.sort(num);
		System.out.println(num);
	}
}



















