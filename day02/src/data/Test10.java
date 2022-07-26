package data;
import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
		//실수의 종류와 특징
		//실수는 소수점이 존재하는 숫자
		
		// -float - 2^32 (4byte, 32bit)
		// -double -기본값 2^64(8byte, 64bit)
		
		float a = 1.5f;
		double b = 1.5;
		
		System.out.println(a);
		System.out.println(b);
		
		//1. 실수는 부정확하다.
		float c = 1.2332423523235212345f;
		System.out.println(c);
		double d = 1.2332423523235212345;
		System.out.println(d);
		
		//2. 실수가 하나라도 포한된 계산은 결과가 실수가 나온다
		System.out.println(10 / 3); //정수 - 정수
		System.out.println(10 / 3.0); //정수 - 실수
		System.out.println(10 / 3f); //실수 - 실수
		System.out.println(10 / 3d); //정수 - 실수
	}
}
