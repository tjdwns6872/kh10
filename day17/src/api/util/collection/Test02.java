package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//List<E>
		
		ArrayList a = new ArrayList(); //저장할 형태를 미 지정(자동으로 Object)
		a.add(100);
		a.add("hello");
		
		ArrayList<Object> b = new ArrayList<Object>();
		ArrayList<String> c = new ArrayList<String>();
		//c.add(100); //type 불일치
		c.add("hello"); //type 일치
		
		//생성 시 우측 Generic type을 생략할 수 있다.
		ArrayList<String> d = new ArrayList<>();
		
		//가급적 List로 업캐스팅하여 생성한다.
		List<String> e = new ArrayList<>();
		List<String> f =new LinkedList<>();
		
		
	}
}
