package condition;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//조건끼리의 계산(논리연산)
		//(Q)나이가 주어져 있을 때, 청소년인이 판정해서 출력
		// -청소년이랑 중1(14)부터 고3(19)까지를 말한다.
		// -and 연산 : &&형태로 사용하며 양쪽 다 true여야 true
		// -or 연산 : ||형태로 사용하며 양쪽 중 하나라도 true면, true
		
		int age = 17;
		
		//boolean teen = 14 <= age <= 19; Erorr
		boolean teen = 14 <= age && age <= 19;
		System.out.println(teen);
		
		if(teen == true) {
			System.out.println("청소년입니다.");
		} if(teen != true) {
			System.out.println("청소년이 아닙니다.");
		}
	}
}
