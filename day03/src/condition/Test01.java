package condition;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		// 조건부 코드
		// -특정 상황에서만 실행되는 코드
		
		int number = 6;
		
		int mod = number % 2;
		//boolean odd = 나머지가 1이면;
		boolean odd = mod == 1;
		//boolean even = 나머지가 0이면;
		boolean even = mod == 0;
		
		if(odd == true) {//이 영역은 odd라는 변수가 true일 때 실행되어야 한다.
			System.out.println(number+"는 홀수입니다.");
		}
		if(even == true) {//이 영역은 even이라는 변수가 true일 때 실행되어야 한다.
			System.out.println(number+"는 짝수입니다.");
		}
	}
}
