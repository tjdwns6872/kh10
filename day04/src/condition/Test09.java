package condition;
import java.lang.*;
import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		/*지하철 요금은 다음과 같습니다.
		 * -어르신(65세~) : 무료
		 * -성인(20세~64세) : 1250원
		 * -청소년(14세~19세) : 720원
		 * -어린이(8세~13세) : 450원
		 * -영유아(~7세) : 무료
		 * 출생년도 4자리가 주어졌을 때 지하철 요금을 계산하여 출력하는 프로그램을 구현*/
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 > ");
		int year = sc.nextInt(); //입력받은 년도를 year변수에 저장
		int now = 2022; //현재 년도
		int fee = 0; //요금 변수
		
		int age = (now - year)+1; //사용자의 출생년도를 나이로 변경
		
		if(age >= 8 && age <= 13) { //사용자의 나이가 8세 이상 그리고 13세 이하일 때
			fee = 450;
		}else if(age >= 20 && age <= 64) { //사용자의 나이가 20세 이상 그리고 64세 이하일 때
			fee = 1250;
		}else if(age >= 14 && age <= 19) { //사용자의 나이가 14세 이상 그리고 19세 이하일 때
			fee = 720;
		}else {	 //사용자의 나이가 다른 if문에 해당되지 않았을 때
			fee = 0;
		}
		System.out.println("사용자의 지하철 요금은 : "+fee+"원 입니다.");
	}
}
