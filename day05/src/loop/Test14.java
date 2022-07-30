package loop;
import java.util.*;
public class Test14 {
	public static void main(String[] args) {
		/*사용자에게 숫자를 하나 입력받아 해당하는 숫자의 구구단을 출력합니다(ex : 5 입력시 구구단 5단 출력)
		 * 사용자는 출력된 구구단을 보고 정답을 입력하며 프로그램에서는 정답 여부를 판정하여 카운트를 합니다.
		 * 모든 문제가 출력되고 난 후 정답 개수와 오답 개수를 구하여 화면에 출력하세요*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		int answerConut = 0;
		int wrongCount = 0;
		
		System.out.println(num+"단 시작!");
		for(int i = 1; i <= 9; i++) {
			System.out.print(num+" x "+i +" = ");
			int answer = sc.nextInt();
			if(answer / num == i) {
				answerConut++;
			}else {
				wrongCount++;
			}
		}
		sc.close();
		System.out.print("게임 종료! 정답 "+answerConut+"개");
		System.out.print(" / "+" 오답 "+wrongCount+"개");
	}
}
