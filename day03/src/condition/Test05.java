package condition;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		/*KH반점에서는 다음과 같은 메뉴를 판매하고 있습니다.
		 * -자장면 : 5000원
		 * -짬뽕 : 6000원
		 * 매출을 올리기 위해서 총3 그릇 이상 주문하면 10%를 할인해줍니다.
		 * 임의의 자장면, 짬뽕 주문 수량에 대해 결제금액을 계산하도록 구현*/
		
		int jajang = 5000;
		int champon = 6000;
		int jCount = 1;
		int cCount = 2;
		int discount = 10;
		
		int total = (jCount * jajang)+(cCount * champon);
		if(jCount + cCount >= 3) {
			total = total-(total/discount);
		}
		System.out.println("주문하신 음식의 금액은 : "+total+"원");
	}
}