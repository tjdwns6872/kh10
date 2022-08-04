package oop.basic3;
public class Test03 {
	public static void main(String[] args) {
		Agency sk = new Agency();
		Agency kt = new Agency();
		Agency lg = new Agency();
		
		sk.agency = "SK";
		sk.goods = "5G언택트52";
		sk.month = 52000;
		sk.data = 200;
		sk.call = 1000;
		sk.message = 2000;
		
		kt.agency = "KT";
		kt.goods = "5G세이브";
		kt.month = 45000;
		kt.data = 100;
		kt.call = 900;
		kt.message = 1500;
		
		lg.agency = "LG";
		lg.goods = "5G시그니처";
		lg.month = 130000;
		lg.data = 500;
		lg.call = 2000;
		lg.message = 2500;
		
		System.out.println("통신사\t 상품명\t 월정액\t 데이터\t 통화\t 문자");
		System.out.print(sk.agency+"\t\t");
		System.out.print(sk.goods+"\t");
		System.out.print(" "+sk.month+"\t ");
		System.out.print(sk.data+"\t\t");
		System.out.print(sk.call+"\t");
		System.out.println(sk.message+"\t");
		
		System.out.print(kt.agency+"\t\t");
		System.out.print(kt.goods+"\t");
		System.out.print(" "+kt.month+"\t ");
		System.out.print(kt.data+"\t\t");
		System.out.print(kt.call+"\t");
		System.out.println(kt.message+"\t");
		
		System.out.print(lg.agency+"\t\t");
		System.out.print(lg.goods+"\t");
		System.out.print(" "+lg.month+"\t ");
		System.out.print(lg.data+"\t\t");
		System.out.print(lg.call+"\t");
		System.out.println(lg.message+"\t");

	}
}
