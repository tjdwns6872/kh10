package io;
import java.lang.*;
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		/*PC방 요금이 시간당 1000원 입니다.
		 * 사용자의 시작시각, 종료시각을 입력받아서 이용요금을 계산하도록 구현
		 * 10원 단위는 버림 처리*/
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("시작 시각을 입력하세요 : "); 
		int inTime = sc.nextInt(); //입력 받은 시작 시각을 변수에 저장
		System.out.print("종료 시각을 입력하세요 : ");
		int outTime = sc.nextInt(); //입력 받은 종료 시각을 변수에 저장
		int fee = 1000; 
		sc.close(); //Scanner 종료
		
		int hourTime = (outTime/100) - (inTime/100); //사용한 시간(단위)을 계산 후 변수에 저장
		int minTime = (outTime%100) - (inTime%100); //사용한 분(단위)을 계산 후 변수에 저장
		double money = hourTime*fee; //사용한 시간을 fee변수와 곱해서 변수에 저장
		money = money+((fee/60.0)*minTime); //시간 당 요금을 60으로 나누어 분당 요금을 구하고, 분당 요금을 사용한 분(단위)와 곱해서 저장
		money = ((int)money/100)*100; //십원 단위 절삭
		
		System.out.println("결제할 금액은 : "+ (int)money); //계산한 금액 출력
	}
}
