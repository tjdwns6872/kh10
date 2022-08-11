package api.lang.object;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		//Object는 모든 클래스의 최상위 클래스이다.
		// -> 다형성의 최고 정점에 있다.
		// -> 아무거나 저장 가능하다
		Object a ="hello";
		Object b = 10;
		Object c =3.14;
		Object d = true;
		Object arr = new int[5];
		Object rand = new Random();
		Object sc = new Scanner(System.in);
		
		//Object 상태일 떄는 고유 기능을 사용할 수 없다.
		// -> 하지만 어떤 형태인지 검사는 가능하다.
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		
		// a는 String 형태인가요?
		System.out.println(a instanceof String);
		System.out.println(a instanceof Random);
		
		//내가 만든 클래스도 Object의 자식인가?
		Object s = new Student();
	}
}
