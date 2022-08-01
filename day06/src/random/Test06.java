package random;
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		/*부루마블이라는 게임을 하다가 무인도에 갇혔습니다.
		 * 무인도에서 탈출하려면 주사위 두 개를 던져서 
		 * 5-5가 나오거나 6-6이 나와야 합니다.
		 * 무인도에서 탈출할 때까지 주사위를 던지고,
		 * 탈출하면 던진 주사위 횟수가 출력되도록 구현하세요.*/
		Random rand = new Random(); //Random 객체 생성
		int number = 0; //주사위 던진 횟수 변수 선언
		while(true) { //무한 루프
			int dice1 = rand.nextInt(6)+1; //1~6까지 랜덤 설정
			int dice2 = rand.nextInt(6)+1; //1~6까지 랜덤 설정
			number++; //주사위 던진 횟수 +1
			if((dice1 == 5 && dice2 == 5) || (dice1 == 6 && dice2 == 6)) { //55 or 66일 경우
			//if(dice1 == dice2 && dice1+dice2 == 10 || dice1 == dice2 && dice1+dice2 == 12) {
				break; //무한 루프 탈출
			}
			//number++;
		}
		System.out.println("탈출 성공");
		System.out.println("주사위를 던진 횟수는 : "+number+"번 입니다");
	}

}
