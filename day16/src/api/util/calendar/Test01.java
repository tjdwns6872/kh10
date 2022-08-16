package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//Calendar 클래스
		// - 추상 클래스여서 객체 생성이 불가능

		//Calendar c = new Calendar(); //직접 생성
		Calendar c = Calendar.getInstance(); //생성 메소드(환경 분석 후 생성)
		System.out.println(c);
		
		//정보가 다 필요한 것이 아니므로 원하는 형태만 뽑을 수 있어야 한다.
		// 1. Date로 변환한 뒤 출력
		// 2. 직접 원하는 정보를 꺼내어 출력
		
		//1
		Date d = c.getTime();
		Format f1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f1.format(d));
		
		//2
		int year = c.get(c.YEAR);
		System.out.println("year = "+year);
		
		int month = c.get(c.MONTH) + 1; // (주의) 월은 실제 값과 1 차이난다
		System.out.println("month = "+month);
		
		//int day = c.get(c.DATE);
		int day = c.get(c.DAY_OF_MONTH);
		System.out.println("day = "+day);
		
		//HOUR은 12시간 방식
		int hour = c.get(c.HOUR_OF_DAY);//HOUR_OF_DAY은 24시간 방식
		System.out.println("hour = "+hour);
		
		//(참고) 요일
		int week = c.get(c.DAY_OF_WEEK);
		System.out.println("week = "+week);
	}
}
