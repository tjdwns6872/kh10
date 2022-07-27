package condition;
import java.util.*;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		/*KH 여행사는 무조건 1명 1박에 10만원이라는 슬로건으로 영업을 하고 있습니다.	
		 * 추가로 여름 여행객을 유치하기 위해 다음과 같은 이벤트를 하기로 결정했습니다
		 * 여름(6,7,8월)에 여행가는 사람은 무조건 이용요금 25% 할인
		 * 다음 정보가 주어졌을 때 예상 여행 경비를 계산하여 출력하도록 프로그래밍하세요
		 * 인원 수(명)
		 * 여행 기간(일)
		 * 여행 계획중인 달(1월~12월 사이)*/
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수(명) : ");
		int man = sc.nextInt();
		System.out.print("여행 기간(일) : ");
		int day = sc.nextInt();
		System.out.print("여행 계획중인 달(1월~12월 사이) : ");
		int mon = sc.nextInt();
		int money = 100000;
		int all = 0;
		int sale = 25;
		
		if(mon >= 6 && mon <= 8) {
			all = (man * day) * money;
			all = all*(100-sale)/100;
		}else {
			all = (man * day) * money;
		}
		System.out.println("총 금액은 : "+all);
		
	}
}
