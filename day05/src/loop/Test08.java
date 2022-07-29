package loop;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		//카운트, 합계 측정
		int count = 0;
		//(ex) 1~100사이의 짝수 개수를 구하여 출력하시오.
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				//System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}
