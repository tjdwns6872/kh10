package loop;
import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
		//합계 구하기
		//1~10까지 더한 결과를 출력하세요
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계 : "+sum);
	}
}
