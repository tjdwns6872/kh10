package io;
import java.lang.*;
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("사용자의 신장을 입력하세요 (cm): ");
		int cm = sc.nextInt(); //사용자가 입력한 신장 값을 변수에 저장
		System.out.print("사용자의 몸무게을 입력하세요 (kg): ");
		int kg = sc.nextInt(); //사용자가 입력한 몸무게 값을 변수에 저장
		String mes; //문구를 출력할 문자열 변수 생성
		sc.close();
		
		double bmicm = (double)cm / 100; //키를 m로 변경
		double bmi = kg / (bmicm * bmicm); //BMI 공식 대입
		bmi = Math.round(bmi * 100)/100.0; //소수점 2자리까지만 표기하고 나머지는 삭제
		if(bmi > 24.5) { //bmi 값이 24.5이상이면 "비만입니다" 문구를 문자열에 저장
			mes = bmi+"비만입니다.";
		}else { //bmi 값이 24.5보다 작으면 "정상입니다" 문구를 문자열에 저장
			mes = bmi+"정상입니다.";
		}
		System.out.println(mes); //문자열에 저장된 문구 출력
	}
}
