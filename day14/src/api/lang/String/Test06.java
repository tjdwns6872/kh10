package api.lang.String;
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		/*욕설 필터링 프로그램
		 * 사용자에게 입력받은 문자열 중에서 욕설에 해당하는 단어를 블라인드(***) 처리하도록 구현
		 * //문자열을 띄어쓰기까지 입력받는 명령
		 * String text = sc.nextLine();
		 * 실제 욕 대신 욕같은 단어로 대체합니다
		 * 신발, 수박, 시베리아, 십장생, 개나리, 주옥, 조카, 시방, 된장, 십자수
		 * 블라인드 처리 시 별 개수는 3개로 고정합니다*/
		Scanner sc = new Scanner(System.in);
		String[] slang = new String[] {"신발","수박","시베리아", "십장생", "개나리", "주옥", "조카", "시방", "된장", "십자수"};
		String word = sc.nextLine();
		for(int i = 0; i < slang.length; i++) {
			boolean referee =  word.contains(slang[i]);
			if(referee) {
				System.out.println(word.replace(slang[i], "***"));
				break;
			}else {
				System.out.println(word);
			}
		}
		sc.close();
	}
}
