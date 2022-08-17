package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
		//원시형 데이터를 저장하는 List
		// - 원시형은 List와 같은 저장소에 저장이 불가능하다
		// - 하고 싶다면 대체 클래스의 형태로 저장이 가능하다(Wrapper class)
		// - 원시형과 Wrapper class는 자동으로 변환된다.
		// - 원시형과 Wrapper class의 가장 큰 차이점은 null을 저장할 수 있는가이다.
		
		// - boolean(Boolean), byte(Byte), short(Short), int(Integer), long(Long)
		// - float(Float), double(Double), char(Character)
		
		//List<int> list = new ArrayList<>(); //불가능 
		List<Integer> list = new ArrayList<>(); //가능
		
		list.add(10);
		//list.add(10.5);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		//List는 순서 유지가 기본이므로, 순서와 관련된 다양한 기능을 사용할 수 있다.
		//도우미 클래스인 Collections를 사용하여 처리
		Collections.reverse(list); //뒤집기
		System.out.println(list);
		
		Collections.shuffle(list); //섞기
		System.out.println(list);
		
		Collections.sort(list); //정렬
		System.out.println(list);
	}
}
















