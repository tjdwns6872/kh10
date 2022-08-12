package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
		/*사용자가 입력한 아이디가 다음 규칙에 맞는지 검사하도록 코드를 작성하시오
		 * 아이디의 첫 글자는 알파벳 소문자로 시작해야 한다
		 * 아이디의 두 번째 글자부터는 숫자 혹은 알파벳 소문자로 작성되어야 한다
		 * 아이디는 총 8글자 이상 20글자 이하로 작성되어야 한다*/
		Scanner sc = new Scanner(System.in);
		String regex = "^[a-z][a-z,0-9]{8,19}$";
		String id = sc.next();
		sc.close();
		boolean referee = Pattern.matches(regex, id);
		System.out.println(referee);
	}
}
