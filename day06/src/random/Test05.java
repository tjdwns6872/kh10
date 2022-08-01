package random;
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		/*주사위를 100번 던졌을 때 
		 * 홀수와 짝수가 각각 몇 번씩 나오는지 계산하여 출력하세요*/
		Random rand = new Random(); //Random 객체 생성
		int even = 0; //짝수 변수 선언
		int odd = 0; //홀수 변수 선언
		for(int i = 1; i <= 100; i++) { //1~100번 반복
			int dice = rand.nextInt(6)+1; //1~6까지 랜덤 수 설정
			if(dice % 2 == 0) { //랜덤 수가 짝수 일 경우
				even++; //짝수 변수 +1
			}else { //짝수가 아닐 경우 
				odd++; //홀수 변수 +1
			}
		}
		System.out.println("홀수 : " + odd); //홀수 값 출력
		System.out.println("짝수 : " + even); //짝수 값 출력
	}
}
