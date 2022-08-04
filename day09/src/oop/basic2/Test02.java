package oop.basic2;

public class Test02 {
	public static void main(String[] args) {
		Country fifa = new Country();
		Country fifa1 = new Country();
		Country fifa2 = new Country();
		
		fifa.rank = 1;
		fifa.country = "브라질";
		fifa.score = 1828.45;
		
		fifa1.rank = 2;
		fifa1.country = "벨기에";
		fifa1.score = 1823.42;
		
		fifa2.rank = 3;
		fifa2.country = "프랑스";
		fifa2.score  = 1786.15;
		
		System.out.println("순위\t 국가\t\t 점수");
		System.out.print(fifa.rank+"\t");
		System.out.print(fifa.country+"\t");
		System.out.println(fifa.score+"\t");
		
		System.out.print(fifa1.rank+"\t");
		System.out.print(fifa1.country+"\t");
		System.out.println(fifa1.score+"\t");
		
		System.out.print(fifa2.rank+"\t");
		System.out.print(fifa2.country+"\t");
		System.out.println(fifa2.score+"\t");
	}
}