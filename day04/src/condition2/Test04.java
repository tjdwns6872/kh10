package condition2;
import java.lang.*;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		/*사용자에게 연도와 월을 입력받아서 날짜 수를 구하는 프로그램을 구현
		 * 윤년은 다음과 같은 규칙에 의해서 정해진다.
		 * - 1년은 정확히 365일이 아니라 365.24... 일이다.
		 * - 대충 4년정도면 하루 약간 모자르게 시간이 늘어난다.
		 * - 4년마다 하루를 더 주면 시간이 느려진다.
		 * - 100년마다 하루를 덜 주고
		 * - 400년마다 하루를 더 주면 대충 날짜가 엇비슷해진다.  
		 * 1. 연도가 4의 배수면 윤년이다.
		 * 2. 4의 배수지만 100의 배수면 윤년이 아니다.
		 * 3. 2번에 해당되더라도 400의 배수면 윤년이다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력 하세요 : ");
		int year = sc.nextInt();
		System.out.print("달(월)을 입력 하세요 : ");
		int mon = sc.nextInt();
		String leap = null;
		int day;
		if(mon == 2) {
			if(year%4 == 0 && year%400 == 0 || year%100 != 0) {
				leap = "윤년입니다.";
				day = 29;
			}else {
				leap = "윤년이아닙니다.";
				day = 28;
			}
		}else if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			day = 30;
		}else {
			day = 31;
		}
		System.out.print("입력하신 연도는 "+year+"년 으로"+leap);
		System.out.print(mon+"월의 마지막 날짜는 "+day+"일 입니다");
	}
}
