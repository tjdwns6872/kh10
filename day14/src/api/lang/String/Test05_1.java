package api.lang.String;
import java.util.*;
public class Test05_1 {
	public static void main(String[] args) {
		/*바나나라는 제시어가 주어져 있을 때 사용자에게 입력받은 글자가 제시어와 이어지는지 검사하여 출력하는 프로그램 구현
		 * (추가)
		 * 반복적으로 수행하면 끝말잇기 혹은 쿵쿵따를 만들 수 있습니다
		 * 끝말잇기는 2글자 이상, 쿵쿵따는 반드시 3글자*/
		Scanner sc = new Scanner(System.in);
		String propose = "바나나";
		
		while(true) {
			Connect con = new Connect(propose);
			String word = sc.next();
			if(word.charAt(0) == propose.charAt(propose.length()-1)) {
				propose = word;				
				System.out.println(propose);
			}else {
				System.out.println("끝말잇기 끝");
				break;
			}
		}
		sc.close();
	}
}
