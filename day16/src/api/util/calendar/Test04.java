package api.util.calendar;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		/*사용자에게 연, 월을 입력받아서 해당하는 달의 달력을 출력하세요
		 * 달력은 어떠한 연도와 월이든 총 6주치가 나와야 합니다
		 * 처음 출력되는 날짜는 해당 연도와 월이 아닐 수 있습니다.
		 * 이전 달이 출력되어야 한다면 이전 달부터 출력합니다
		 * 한 줄에 한 주치 일자가 출력되어야 합니다.
		 * 최상단에는 요일 정보가 출력되어야 합니다.
		 * ex : 2022, 3을 입력한 경우
		 * 일		월		화		수		목		금		토
		 * 27		28		1		2		3		4		5
		 * 6		7		8		9		10		11		12
		 * 13		14		15		16		17		18		19
		 * 20		21		22		23		24		25		26
		 * 27		28		29		30		31		1		2
		 * 3		4		5		6		7		8	    9*/
		
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		System.out.print("연을 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("달(월)을 입력하세요 : ");
		int month = sc.nextInt();
		c.set(year, month-1, 1); //입력 받은 연도, 월(-1), 일은 1일 초기화
		int week = c.get(c.DAY_OF_WEEK); //해당 달에 1일 요일
		
		//System.out.println(week);
		
		if(c.get(c.DAY_OF_WEEK) != 1) { //해당 달이 일요일로 시작하지 않을 경우
			c.add(c.DATE, -(week-1)); //요일-1 만큼 일수 빼기
		}
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 1; i <= 42; i++) { //6주 출력을 위해 42번 반복
			System.out.print(c.get(c.DATE)+"\t"); //날짜 출력
			c.add(c.DATE, 1); //출력 후 +1
			if(i % 7 == 0) { //날짜가 7배수 만큼 나왔으면
				System.out.println("\n"); //줄 바꿈
			}
		}
		sc.close();
	}
}
