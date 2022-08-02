package array;
import java.util.*;
public class Test09 {
	public static void main(String[] args) {
		/*사용자에게 숫자 5개를 입력받아 배열에 저장합니다
		 * 입력받은 모든 숫자를 출력합니다
		 * 입력받은 모든 숫자의 합계와 평균을 구하여 출력합니다*/
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		int[] number = new int[5]; //배열 크기 5로 선언
		int total = 0; // total변수 선언
		for(int i = 0; i < number.length; i++) { //0~number배열 크기만큼 반복
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt(); 
			number[i] = num; //입력 받은 값 배열에 대입
			System.out.println(number[i]); //배열 출력
			total += num; //total변수에 입력 받은 숫자 +
		}
		sc.close();
		int avg = total/number.length; //total/number배열 크기만큼 나누기
		System.out.println("총합 : "+total);
		System.out.println("평균 : "+avg);
	}
}
