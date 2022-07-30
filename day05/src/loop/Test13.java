package loop;
public class Test13 {
	public static void main(String[] args) {
		/*고대 그리스에 현명한 노인이 살고 있었습니다
		 * 어느날 왕이 소문을 듣고 노인에게 말했습니다
		 * "갖고싶은게 있으면 말해봐라! 다 들어줄게!"
		 * 노인이 말했습니다
		 * "저는 욕심이 없습니다. 30일동안 첫 날은 
		 * 1원만 주시고 둘째 날 부터는 두배를 주십시오"
		 * (1) 한달동안 노인이 받게되는 금액을 일자별로 출력하시고 
		 * (2) 노인의 통장에 한달 뒤에 찍히는 금액을 출력하세요 
		 * (3) 40일이면 어떻게 되는지 출력해보세요*/
		
		long money = 1L;
		long allMoney = 0L;
		long fourty = 0L;
		
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
	}
}
