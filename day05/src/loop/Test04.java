package loop;
import java.lang.*;
import java.util.*;
public class Test04 {
	public static void main(String[] args) throws InterruptedException {
		/*타이머 만들기
		 * 사용자가 분과 초를 설정하면 해당하는 시간만큼의 메세지 출력 후 종료되는 프로그램을 구현
		 * (ex)
		 * 분 입력 : 2
		 * 초 입력 :10
		 * 2분 10초 남았습니다 
		 * 2분 9초 남았습니다*/
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int min = sc.nextInt();
		System.out.print("초 입력 : ");
		int sec = sc.nextInt();
		int over = (min*60)+sec;
		int overSec = over;
		for(int i = 1; i <= over; i++) {
			overSec -= 1;
			int minTime = overSec / 60;
			int secTime = overSec % 60;
			System.out.println(minTime+"분 "+secTime+" 초 남았습니다.");
			Thread.sleep(1000);
		}
	}
}
