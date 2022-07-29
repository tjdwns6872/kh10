package loop;
import java.lang.*;
import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		/*사용자에게 10개의 숫자를 입력받아 짝수와 홀수 개수를 각각 구하여 출력*/
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		for(int i = 0; i < 10; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		sc.close();
		System.out.println("홀수는 "+odd);
		System.out.println("짝수는 "+even);
	}
}
