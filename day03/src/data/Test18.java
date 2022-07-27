package data;
import java.lang.*;
import java.util.*;
public class Test18 {
	public static void main(String[] args) {
		/*2000년생이 편의점에 와서 담배를 사려고 합니다.
		 * 구매 가능한지 판정해서 출력
		 * (담배는 한국 나이로 20세 이상이면 구매가 가능합니다)*/
		//한국식 나이는 태어난 해부터 1살로 취급
		
		int age = 20;
		int birth = 2000;
		//int year = 2022;
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		int myAge = (year - birth) + 1;
		System.out.println(myAge);

		boolean adult = age <= myAge;
		System.out.println(adult);
	}
}
