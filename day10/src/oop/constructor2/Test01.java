package oop.constructor2;
public class Test01 {

	public static void main(String[] args) {
		/*다음 요구사항에 맞게 데이터를 객체로 구현하고 정보를 출력하세요
		 * 캐릭터 정보
		 * 아이디		직업	레벨
		 * 마리오		전사	 50
		 * 루이지		마법사 1
		 * 피오나		마법사 1
		 * 요구사항
		 * 아이디와 직업은 반드시 설정되도록 구현하세요
		 * 레벨을 설정하지 않으면 자동으로 1로 설정되게 구현하세요*/
		Character ch1 = new Character("마리오", "전사", 50);
		Character ch2 = new Character("루이지", "마법사");
		Character ch3 = new Character("피오나", "마법사");
		
		//b의 레벨이 올랐다./
		//b.level++; //비추천
		ch2.levelUp();
		
		ch1.print();
		ch2.print();
		ch3.print();
	}
}