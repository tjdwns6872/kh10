package api.lang.String;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		/*사용자에게 프로그램에서 사용할 닉네임을 입력받을 예정입니다
		 * 닉네임은 2글자 이상 10글자 이내로 설정해야 합니다
		 * 닉네임에는 절대로 운영자라는 글자가 포함될 수 없습니다
		 * 위의 경우에 해당한다면 잘못된 닉네임 형식입니다 출력, 아니면 닉네임 설정 완료 출력*/
		Scanner sc = new Scanner(System.in);
		System.out.print("사용할 닉네임을 입력하세요 : ");
		String nick = sc.next();
		sc.close();
		
		if(nick.length() < 2 || nick.length() > 10 || nick.contains("운영자")) {
			System.out.println("잘못된 닉네임 형식입니다.");
		}else {
			System.out.println("닉네임 설정 완료");
		}
	}
}
