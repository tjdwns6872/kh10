package api.lang.String;
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		/*바나나라는 제시어가 주어져 있을 때 사용자에게 입력받은 글자가 제시어와 이어지는지 검사하여 출력하는 프로그램 구현*/
		
		Scanner sc = new Scanner(System.in);
		String propose = "바나나";
		String word = sc.next();
		sc.close();
		
		if(word.charAt(0) == propose.charAt(propose.length()-1)) {
			System.out.println("이어진다.");
		}else {
			System.out.println("안 이어진다.");
		}
	}
}
