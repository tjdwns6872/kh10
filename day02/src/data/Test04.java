package data;
import java.lang.*;
/*영화관 요금표
 * -성인 : 12000원, 청소년 : 7500원
 * 성인 2명과 청소년 3명이 영화를 볼 때 이용요금을 출력*/
public class Test04 {
	public static void main(String[] args) {
		int adult = 12000;
		int teenager = 7500;
		int adultPer = 2;
		int teenagerPer = 3;
		
		int adultTotal = adult * adultPer;
		int teenagerTotal = teenager * teenagerPer;
		int Total = adultTotal + teenagerTotal;
		
		System.out.println("성인 Total: "+adultTotal+"원");
		System.out.println("청소년 Total: "+teenagerTotal+"원");
		System.out.println("Total: "+Total+"원");
	}
}
