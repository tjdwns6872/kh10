package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
		/*이번 주 로또 예상번호를 추첨하여 출력
		 * 단, 번호는 낮은 것부터 출력*/
		
		Random rand = new Random();
		List<Integer> list = new ArrayList<>();
		
		//1
		for(int i = 0; i < 7; i++) {
			int number = rand.nextInt(45)+1;
			if(!(list.contains(number))) {
				list.add(number);
			}else {
				i--;
			}
		}
		Collections.sort(list);
		System.out.println(list);
	}
}