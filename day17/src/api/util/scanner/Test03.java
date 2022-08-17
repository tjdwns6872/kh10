package api.util.scanner;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		//키보드 입력에서의 문제사황
		// - .next() 계열의 명령 사용 후 .nextLine()을 사용하면 입력이 안 된다.
		// - 입력이 안되는 이유는 남아있는 \n 때문
		// - 남아있는 \n을 제거하면 입력이 가능하다
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next(); //사용자의 입력값 중에서 공백 전까지 입력받아 저장
		sc.nextLine(); //남아있는 \n을 제거하는 명령
		String b = sc.nextLine(); //서용자의 입력값 중에서 \n 전까지 입력받아 저장
		
		System.out.println(a);
		System.out.println(b);
	}
}
