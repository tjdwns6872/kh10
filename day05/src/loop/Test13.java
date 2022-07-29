package loop;
public class Test13 {
	public static void main(String[] args) {
		long money = 1;
		long allMoney = 0;
		long fourty = 0;
		
		for(int i = 1; i <= 40; i++) {
			if(i <= 30) {
				System.out.println(i+"일차 금액 : "+money);
				allMoney += money;
			}
			fourty += money;
			money *= 2;
		}
		System.out.println("노인이 한달 동안 받은 총 금액은 "+allMoney +"원 입니다.");
		System.out.println("노인이 40일 동안 받은 총 금액은 "+fourty +"원 입니다.");
		System.out.println("노인이 40일째 받는 금액은 "+money +"원 입니다.");
	}
}
