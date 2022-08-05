package oop.method7;

public class Test01 {

	public static void main(String[] args) {
		Melon m1 = new Melon();
		Melon m2 = new Melon();
		Melon m3 = new Melon();
		Melon m4 = new Melon();
		
		m1.setting("그때 그 순간 그대로(그그그)", "WSG워너비", 
				"WSG워너비 1집", 104250, 91835);
		m2.setting("보고싶었어", "WSG워너비", 
				"WSG워너비 1집", 83127, 90805);
		m3.setting("LOVE DIVE", "IVE(아이브)", "LOVE DIVE", 64590, 174519);
		m4.setting("POP!", "나연(TWICE)", "IM NAYEON", 58826, 70313);
		
		m1.print();
		m2.print();
		m3.print();
		m4.print();
	}
}
