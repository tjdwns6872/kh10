package oop.method4;
public class Test01 {
	public static void main(String[] args) {
		Menu menu1 = new Menu();
		Menu menu2 = new Menu();
		Menu menu3 = new Menu();
		Menu menu4 = new Menu();
		
		menu1.setting("아메리카노", "음료", 2500, true);
		menu2.setting("모카라떼", "음료", 3500);
		menu3.setting("치즈케이크", "디저트", 5000, true);
		menu4.setting("마카롱", "디저트", 3000);
		
		menu1.eventing();
		menu2.eventing();
		menu3.eventing();
		menu4.eventing();
		
		menu1.print();
		menu2.print();
		menu3.print();
		menu4.print();
	}
}
