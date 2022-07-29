package loop;
import java.lang.*;
import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		/*소수 판정 프로그램
		 * 소수는 나누어 떨어지는 값이 없는 숫자를 말합니다(ex : 2, 3, 5, 7, 11, 13, 17, 19, 23, ...)
		 * 어짜피 모든 숫자는 1로 나누기가 가능하고, 자기자신으로 나누기가 가능합니다
		 * (ex) 4는 소수가 아닙니다
		 * 4 % 1 = 0
		 * 4 % 2 = 0
		 * 4 % 3 = 1
		 * 4 % 4 = 0
		 * (ex) 5는 소수입니다
		 * 5 % 1 = 0
		 * 5 % 2 = 1
		 * 5 % 3 = 2
		 * 5 % 4 = 1
		 * 5 % 5 = 0*/
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 판별할 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.close();
		int count = 0;
		String mes;
		for(int i = 1; i <= num; i++) { //입력된 수만큼 반복
			if(num % i == 0 && num != i && i != 1) { //입력된 수가 1부터 나누어서 나머지가 0인 값을 찾는다(1과 자신의숫자 제외)
				count++;	//1과 자신의 숫자를 제외한 수와 나누었을 때 나머지가 0인 숫자를 발견 시 count + 1
				}
		}
		if(count >= 1) { //count가 1이상을 때 소수가 아닙니다 문구 저장
			mes = "소수가아닙니다";
		}else { //count가 1미만일 때 소수입니다 문구 저장
			mes = "소수입니다";
		}
		System.out.println(mes); // 저장된 문구 출력
	}
}
