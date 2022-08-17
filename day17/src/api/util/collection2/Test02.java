package api.util.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		/*로또 번호 추첨 문제를 Set으로 풀어보세요*/
		
		Set<Integer> list = new TreeSet<>();
		//while(list.size() < 6){
		while(true) {
			Random rand = new Random();
			list.add(rand.nextInt(45)+1);
			if(list.size() == 6) {
				break;
			}
		}
		System.out.println(list);
	}
}
