package random;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		/*사용자가 3번 틀릴 때까지 무작위로 구구단 문제를 출제하는 프로그램을 구현하세요
		 * 3번 틀리면 게임오버가 되며 그동안 맞춘 문제 개수가 출력되어야 합니다.*/
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int answerCount = 0;
		int wrongCount = 0;
		while(true) {
			int den = rand.nextInt(8)+2; //랜덤으로 단 설정(2~9)
			int num = rand.nextInt(9)+1; //랜덤으로 인수 값 설정(1~9)
			System.out.print(den+" x "+num+" = "); //랜덤으로 구구단 출력
			int answer = sc.nextInt(); //사용자가 답 입력
			if(den * num == answer) { //사용자 입력 값이 답 과 같다면
				answerCount++; //answerCount + 1
			}else { //답이 아니라면
				wrongCount++; //wrongCount +1
				if(wrongCount == 3) { //wrongCount가 3일 때
					break; //무한루프 탈출
				}
			}
		}
		sc.close();
		System.out.println("총 " + answerCount+"개 맞추셨습니다");
	}

}
