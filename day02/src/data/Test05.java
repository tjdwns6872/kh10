package data;

/*커피숍 메뉴
 * -아메리카논 : 1300원, 라떼 : 2000원
 * 아메리카노는 4명, 라떼는 3명
 * 커피요금을 계산하여 출력*/
import java.lang.*;
public class Test05 {

	public static void main(String[] args) {
		int americano = 1300;
		int latte = 2000;
		int americanoHum = 4;
		int latteHum = 3;
		
		int americanoTotal = americano * americanoHum;
		int latteTotal = latte * latteHum;
		int Total = americanoTotal + latteTotal;
		
		System.out.println("아메리카노 Total: "+americanoTotal+"원");
		System.out.println("라떼 Total: "+latteTotal+"원");
		System.out.println("Total: "+Total+"원");
	}
}
