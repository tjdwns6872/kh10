package loop;
import java.lang.*;
import java.util.*;
public class Test02 {
	public static void main(String[] args){
		//사용자에게 숫자를 5개 입력받는 프로그램을 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		for(int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			System.out.println(number);
		}
		sc.close();
	}
}
