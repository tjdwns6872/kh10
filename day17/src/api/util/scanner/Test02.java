package api.util.scanner;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		String origin = "학교종이 땡땡땡 어서모여라\n선생님이 우리를 기다리신다.";
		Scanner sc = new Scanner(origin);
		
		// .nextLine() - 줄바꿈(\n) 전까지 읽는 명령
		// .hasNextLine() - 줄 읽기가 가능한지 확인하는 명령
//		System.out.println(sc.nextLine());
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
	}
}
