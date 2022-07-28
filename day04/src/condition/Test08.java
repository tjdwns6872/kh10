package condition;
import java.lang.*;
import java.util.*;
public class Test08 {
	public static void main(String[] args) {
		//다중 조건
		//(Q) 월이 주어져 있을 때 계절을 구하여 출력
		// -봄 : 3, 4, 5
		// -여름 : 6, 7, 8
		// -가을 : 9, 10, 11
		// -겨울 : 12, 1, 2
		Scanner sc = new Scanner(System.in);
		System.out.print("달(월)을 입력하세요 : ");
		int mon = sc.nextInt();
		
		if(mon >= 3 && mon <= 5) {
			System.out.println("봄입니다.");
		}else if(mon >= 6 && mon <= 8) {
			System.out.println("여름입니다.");
		}else if(mon >= 9 && mon <= 11) {
			System.out.println("가을입니다.");
		}else {
			System.out.println("겨울입니다.");
		}
	}
}
