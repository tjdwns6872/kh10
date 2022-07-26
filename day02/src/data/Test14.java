package data;
import java.lang.*;
public class Test14 {
	public static void main(String[] args) {
		/*BMI 계산기
		 * BMI는 체질량지수(비만지수)를 말합니다
		 * 구하는 공식은 BMI = 체중(kg) / 키(m)² 입니다.
		 * 키가 180cm이고, 체중이 80kg인 사람의 BMI 지수를 구하여 출력
		 * (네이버에 BMI 계산기 라고 검색하면 완성된 프로그램이 나옵니다)*/
		
		int cm = 180;
		int kg = 80;
		
		double bmicm = (double)cm / 100;
		double bmi = kg / (bmicm * bmicm);
		
		System.out.printf("%.1f", bmi);
		
	}
}
