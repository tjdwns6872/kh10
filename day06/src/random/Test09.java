package random;
import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		/*아이템 강화 시뮬레이션
		 * 강화 확률은 다음과 같습니다.
		 * - 성공 : 25% 확률로 아이템의 레벨이 +1 됩니다.
		 * - 실패 : 25% 확률로 아이템의 레벨이 -1 됩니다.
		 * - 현상유지 : 50% 확률로 아이템이 레벨이 변하지 않습니다.
		 * 0레벨의 아이템을 주어진 확률로 15레벨까지 만들기 위한 강화 횟수를 구하여 출력
		 * (단, 아이템 레벨은 절대로 0보다 작거나 15보다 커지는 일은 없습니다.)*/
		Random rand = new Random(); //Random 객체 생성
		int item = 0; //item 강화 레벨을 저장할 변수 선언
		int count = 0; //강화 시도 횟수를 저장할 변수 선언
		while(true) { //무한루프
			int per = rand.nextInt(100)+1; //1~100까지 랜덤한 숫자 
			count++; //시도 횟수 +1
			if(per <= 25) { //25%
				System.out.println("강화 성공");
				item++; //강화 레벨 +1
				if(item == 15) { //item이 15일 때 무한루프 탈출
					break;
				}
			}else if(per > 25 && per <= 50) { //25%(25까지는 성공이므로 26부터 50까지 실패로 확률 적용)
				System.out.println("강화 실패");
				item--; //강화레벨 -1
				if(item < 0) { //강화레벨이 0보다 작아질 때 강화레벨 0으로 초기화
					item = 0;
				}
			}else { //나머지 확률은 현상유지
				System.out.println("현상 유지");
			}
		}
		System.out.println("현재 강화 레벨 : "+item); //현재 강화 레벨 출력
		System.out.println("강화를 "+count+"번 시도 하셨습니다."); //강화 시도 횟수 출력
	}
}