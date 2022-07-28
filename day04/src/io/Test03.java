package io;
import java.lang.*;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		//보조 도구(Scanner)를 사용한 입력
		// - Scanner는 기본적으로 제공되는 도구가 아니다.
		// - 만들어서 사용해야 한다.
		
		//객체 생성
		// - new는 오른쪽에 제시된 도구를 생성하는 명령
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("a = "+a);
		
		float b = sc.nextFloat();
		System.out.println("b = "+b);
		
		double c = sc.nextDouble();
		System.out.println("c = "+c);
		
		//다 사용했으면 도구 정리
		sc.close();
	}
}
