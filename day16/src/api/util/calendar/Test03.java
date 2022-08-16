package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		/*오늘 사귄 커플의 100일 기념일이 몇일인지 계산하여 출력*/
		
		Calendar c = Calendar.getInstance();
		//int date = c.get(c.DATE);
		//c.set(c.DATE, date+99);
		c.add(c.DATE, 99);
		
		Date d = c.getTime();
		Format f1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(f1.format(d));
	}
}
