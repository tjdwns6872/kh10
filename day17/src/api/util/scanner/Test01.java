package api.util.scanner;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		String origin = "학교종이 땡땡땡 어서모여라\n선생님이 우리를 기다리신다.";
		Scanner sc = new Scanner(origin);
		
		// .next() - 단어(공백 전까지)
		// .hasNext() - 읽을 수 있는 단어가 있는지 확인하는 명령
//		System.out.println(sc.next());
//		while(true) {
//			if(sc.hasNext() == false) {
//				break;
//			}
//			System.out.println(sc.next());
//		}
		
		while(sc.hasNext() == true) {
			System.out.println(sc.next());
		}
		sc.close();
		
	}
}
