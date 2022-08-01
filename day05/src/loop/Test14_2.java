package loop;
import java.util.*;
public class Test14_2 {
	public static void main(String[] args) {
		/*사용자에게 숫자를 하나 입력받아 해당하는 숫자의 구구단을 출력합니다(ex : 5 입력시 구구단 5단 출력)
		 * 사용자는 출력된 구구단을 보고 정답을 입력하며 프로그램에서는 정답 여부를 판정하여 카운트를 합니다.
		 * 모든 문제가 출력되고 난 후 정답 개수와 오답 개수를 구하여 화면에 출력하세요*/
		//추가 - 점수 계산 (맞추면 +10점, 틀리면 -10점)
		//추가 - 콤보 계산
		Scanner sc = new Scanner(System.in); //scanner 객체 생성
		int score = 0; //점수 변수 생성
		int combo = 0;
		System.out.print("단 입력 : ");
		int num = sc.nextInt(); //단 입력
		int answerConut = 0; //정답 개수 변수
		int wrongCount = 0; //오답 개수 변수
		
		System.out.println(num+"단 시작!");
		for(int i = 1; i <= 9; i++) { //1~9까지 반복
			System.out.print(num+" x "+i +" = ");
			int answer = sc.nextInt(); //사용자에게 문제의 답 입력 받기
			if(answer / num == i) { //입력 받은 답 / 단 == i 일때
				answerConut++; //정답 횟수 추가
				combo++;
				score += combo * 10; //점수 +10
			}else { 
				wrongCount++; //오답 횟수 추가
				score -= 10; //점수 -10점
				combo = 0;
			}
			System.out.println("combo"+combo);
		}
		sc.close();
		System.out.print("게임 종료! 정답 "+answerConut+"개");
		System.out.print(" / "+" 오답 "+wrongCount+"개");
		System.out.println("\n총 점수 "+score);
	}
}
