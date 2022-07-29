package loop;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		//(Q) 1부터 100까지 홀수/짝수를 출력
		/*for(int i = 1; i <= 99; i += 2) { //홀수
			System.out.println("홀수 = "+i);
		}*/
		/*for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				System.out.println("홀수 = "+i);
			}
		}*/
		/*for(int i = 2; i <= 100; i += 2) { //짝수
		System.out.println("짝수 = "+i);
		}*/
		for(int i = 1; i <= 100; i++) { 
			if(i % 2 == 0) {
				System.out.println("짝수 = "+i);
			}
		}
	}
}
