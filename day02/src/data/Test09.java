package data;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		/*KH PC방에서는 1시간에 1200원의 요금을 받고 있습니다.
		 * 만약 요금이 10원단위로 나올 경우 해당 요금은 받지 않습니다
		 * (ex) 1250원이면 1200원만 받습니다
		 * 12시 40분부터 16시 10분까지 이용한 고객의 요금을 출력*/
		
		int hour1 = 12, min1 = 40;
		int hour2 = 16, min2 = 10;
		int time1 = hour1 * 60 + min1;
		int time2 = hour2 * 60 + min2;
		int time = time2 - time1;
		
		int hour = time / 60;
		int min = time % 60;
		
		//int fee = (time/100) * 100;
		int fee = (time/5)*100;
		
		System.out.println("사용시간 : "+hour+"시간"+min+"분");
		System.out.println("PC방 요금 : "+fee+"원");
		}
}
