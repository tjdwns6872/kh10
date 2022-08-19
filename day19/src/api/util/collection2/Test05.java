package api.util.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
	public static void main(String[] args) {
		//집합 연산
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		List<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(4);
		b.add(5);
		
		
		List<Integer> c =new ArrayList<>();
		c.addAll(b);
		c.addAll(a);
		System.out.println(c);
	}
}
