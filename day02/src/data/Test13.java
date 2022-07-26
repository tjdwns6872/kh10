package data;
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		/*KH 주유소에서는 휘발유를 1L에 1920원에 판매중입니다
		 * 50000원을 주유했을 때 주유 가능한 리터(L)를 구하여 출력*/
		
		int won = 50000;
		int price = 1920;
		
		double total = (double)won/price;
		
		System.out.printf("%.3fL", total);
	}
}
