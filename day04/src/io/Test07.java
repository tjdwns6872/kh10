package io;
import java.lang.*;
import java.util.*;
public class Test07 {
	public static void main(String[] args) {
		//문자열 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 입력 : ");
		String nickname = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		sc.close();
		System.out.println("입력된 닉네임은 "+nickname+" 입니다.");
		System.out.println("나이는 "+age+"세 입니다.");
	}
}
