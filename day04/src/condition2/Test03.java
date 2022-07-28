package condition2;
import java.lang.*;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		/*사용자에게 월을 입력받아 해당 월의 마지막 날짜를 구하여 출력하는 프로그램을 구현하세요
		 * 2월은 28일까지 있다고 가정합니다(윤년은 고려하지 않습니다)
		 * 4, 6, 9, 11월은 30일까지 있습니다
		 * 1, 3, 5, 7, 8, 10, 12월은 31일까지 있습니다*/
		Scanner sc = new Scanner(System.in);
		System.out.print("달(월)을 입력하세요 : ");
		int mon = sc.nextInt();
		int day = 0;
		/*if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			day = 30;
		}else if (mon == 2){
			day = 28;
		}else{
			day = 31;
		}*/
		switch(mon) {
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			day = 31;
		}
		System.out.println(mon+"월의 마지막 날짜는 "+day+"일 입니다");
	}
}
