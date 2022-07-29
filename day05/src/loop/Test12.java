package loop;
import java.lang.*;
public class Test12 {
	public static void main(String[] args) {
		/*오늘부터 30일간 다이어트를 하기로 했습니다
		 * 매일매일 개수를 늘려가면서 푸시업을 할 계획입니다.
		 * 첫째날은 힘드니까 3개만 합니다
		 * 둘째날부터는 전날보다 3개씩 더 합니다
		 * (1) 30일 동안 일자별로 하게되는 푸시업 개수를 출력 
		 * (2) 30일 동안 하게되는 푸시업 개수의 총 합계를 출력*/
		int count = 0; //하루의 푸시업의 개수를 더한 개수를 저장할 변수
		int all = 0; //총 합계를 저장할 변수
		for(int i = 1; i<= 30; i++) {
			count += 3; //하루에 3번씩 추가
			all += count; //총합계에 더해서 저장
			System.out.println(i+"일차 푸시업의 개수 : "+count); //일차 별로 푸시업의 개수 출력
		}
		System.out.println("30일 동안 한 푸시업의 개수 : "+all); //30일 동안 한 푸시업의 총 개수 출력
	}
}
