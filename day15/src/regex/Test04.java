package regex;

import java.util.regex.Pattern;

public class Test04 {
	public static void main(String[] args) {
		/*사용자에게 생년월일을 YYYY-MM-DD 형식으로 입력받아 올바른 날짜 형식인지 검사하세요
		 * 연도는 1900년부터 2099년까지 가능합니다
		 * 최초 검사식을 만들 때는 모든 달은 31일까지 있다고 가정하고 만듭니다
		 * 1번을 풀고 나서 큰달과 작은달을 구분해서 만듭니다(2월은 28일로 가정)
		 * 2번을 풀고 나서 윤년을 고려하도록 만듭니다*/
		String regex = "^(1[9][0-9]{2}|2[0][0-9]{2})-((0[469]|1[1])-([0-2][0-9]|[3][0])|(0[13578]|1[02])-([0-2][0-9]|[3][0-1])|02-([0-1][0-9]|[2][0-8]))$";
		String input = "2000-02-29";
		/*int year = ((int)input.charAt(3)-48)+(((int)input.charAt(2)-48)*10)+(((int)input.charAt(1)-48)*100)+(((int)input.charAt(0)-48)*1000);
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year+" 윤년");
		}else {
			System.out.println(year+" 평년");
		}*/
		String year = input.substring(0,4);
		int yearValue = Integer.parseInt(year);
		
		boolean leapYear = yearValue % 4 == 0 && yearValue % 100 != 0 || yearValue % 400 == 0;
		
		if(leapYear) {
			regex = "^(1[9][0-9]{2}|2[0][0-9]{2})-((0[469]|1[1])-([0-2][0-9]|[3][0])|(0[13578]|1[02])-([0-2][0-9]|[3][0-1])|02-([0-1][0-9]|[2][0-9]))$";
		}else {
			regex = "^(1[9][0-9]{2}|2[0][0-9]{2})-((0[469]|1[1])-([0-2][0-9]|[3][0])|(0[13578]|1[02])-([0-2][0-9]|[3][0-1])|02-([0-1][0-8]|[2][0-9]))$";
		}
		boolean test = Pattern.matches(regex, input);
		System.out.println("test = "+test);
	}
}
