package io;
import java.lang.*;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		//중국집 금액 계산 프로그램
		Scanner sc = new Scanner(System.in);
		
		int jja = 5000, cham = 6000;
		System.out.print("짜장면의 개수를 입력하세요: ");
		int jjaCount = sc.nextInt();
		System.out.print("짬뽕의 개수를 입력하세요: ");
		int chamCount = sc.nextInt();
		sc.close();
		
		int total = (jja * jjaCount) + (cham * chamCount);
		
		System.out.println("결제 금액 : "+ total);
		
	}
}
