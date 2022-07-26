package data;
import java.lang.*;
import java.sql.Time;
public class Test07 {

	public static void main(String[] args) {
		//(Q) 1h 40m + 2h 30m
		int hour1 = 1;
		int minute1 = 40;
		int hour2 = 2;
		int minute2 = 30;
		
		int time1 = 60 * hour1 + minute1;
		//System.out.println(time1);
		int time2 = 60 * hour2 + minute2;
		//System.out.println(time2);
		
		int time = time1+time2;
		//System.out.println(time);
		int hour = time/60;
		int minute = time%60;
		
		System.out.println(hour+"시간"+minute+"분");
	}
}
