package data;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		/*
		 * KH주차장의 요금은 다음과 같습니다
		 * 0분부터 9분까지 무료
		 * 10분부터 19분까지 1000원
		 * 이후 10분당 1000원씩 추가
		 * 12시 40분에 들어와서 16시 10분에 나간 차량이 있을 때 이 차량의 주차시간과 요금을 구해서 출력*/
		
		int hour1 = 12;
		int min1 = 40;
		int hour2 = 16;
		int min2 = 10;
		int period = 1000;
		
		int time1 = hour1 * 60 + min1;
		int time2 = hour2 * 60 + min2;
		int time = time2 - time1;
		int total = (time/10)*period;
		
		int hour = time/60;
		int min = time%60;
		
		System.out.println("주차시간 : "+hour+"시간"+min+"분");
		System.out.println("주차요금 : "+total+"원");
	}
}