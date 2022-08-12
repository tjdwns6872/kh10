package regex;

import java.util.*;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		/*사용자가 입력한 닉네임이 다음 규칙에 맞는지 검사하도록 코드를 작성하시오
		 * 닉네임은 한글 또는 숫자로만 작성되어야 한다
		 * 닉네임은 2글자 이상 10글자 이하로 작성되어야 한다
		 * ㅋㅋㅋ, ㅡㅡ와 같은 자음 모음만 있는 경우는 불가능하다*/
		Scanner sc = new Scanner(System.in);
		String regex = "^[가-힣,0-9]{2,10}$";
		String nickname = sc.next();
		sc.close();
		boolean referee = Pattern.matches(regex, nickname);
		System.out.println(referee);
	}
}
