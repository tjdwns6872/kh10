package oop.keyword7;

public class Test01 {
	public static void main(String[] args) {
		/*다음 요구사항에 맞게 데이터 구현
		 * 요구사항
		 * 다음 데이터는 KH은행의 "내집마련 장기적금" 계좌에 대한 정보입니다.
		 * 모든 통장은 (동일한 기본이율)을 적용받습니다.
		 * 모든 통장의 잔액은 (음수일 수 없습니다)
		 * 모든 통장의 (기본이율, 우대이율은 음수일 수 없습니다)
		 * 데이터
		 * 이름	기본이율	우대이율	잔액
		 * 유재석	1.2	0.3	5000000
		 * 강호동	1.2	0.5	3500000
		 * 신동엽	1.2	0.2	8000000*/
//		Client.setBasic(1.2); //기본이율 설정
		
		Client c1 = new Client("유재석", 0.3, 5000000);
		Client c2 = new Client("강호동", 0.5, 3500000);
		Client c3 = new Client("신동엽", 0.2, 8000000);
		
		
		c1.print();
		c2.print();
		c3.print();
		
	}
}
