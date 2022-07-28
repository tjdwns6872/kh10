package condition;
import java.lang.*;
import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		/*작성한 게시글이 몇 초 전에 작성되었는지에 대한 값이 주어진다고 가정합니다.
		 * 시간을 다음 규칙에 따라 변환하여 출력하는 프로그램을 구현
		 *  -방금 전 : 작성한 지 10초 이내인 글
		 *   -?초 전 : 작성한지 1분이 되지 않은 글
		 *   -?분 전 : 작성한지 1분 이상이면서 1시간이 되지 않은 글
		 *   -?시간 전 : 작성한지 1시간 이상이면서 24시간이 되지 않은 글
		 *   -?일 전 : 나머지*/
		Scanner sc = new Scanner(System.in);
		System.out.print("글이 작성 된 시간을 입력하세요(초단위) : ");
		int sec = sc.nextInt();
		int time = 0;
		int min = 60;
		int hour = min * 60;
		int day = (min * 60) * 24;
		
		if(sec <= 10) {
			System.out.println("방금 전");
		}else if(sec < min) {
			time = sec;
			System.out.println(time+"초 전");
		}else if(sec < hour) {
			time = sec/min;
			System.out.println(time+"분 전");
		}else if(sec < day) {
			time = sec/hour;
			System.out.println(time+"시간 전");
		}else {
			time = sec/day;
			System.out.println(time+"일 전");
		}
	}
}