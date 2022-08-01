package loop3;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		/*숫자 모래성 게임
		 * 사용자에게 숫자를 입력받아서 입력한 숫자만큼 100에서 차감을 합니다
		 * 계속적으로 입력을 받아서 감소시키다가 숫자가 음수가 되면 게임 오버 메세지를 띄우고 종료
		 * 게임 오버 전까지 입력한 숫자의 개수를 출력해보세요*/
		Scanner sc = new Scanner(System.in); //scanner 객체 생성
		int total = 100; //total변수에 100저장
		int count = 0; //입력 횟수를 받을 변수 저장
		while(true) { //무한루프
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt(); //사용자가 입력한 숫자를 num변수에 저장
			total -= num; //total에서 사용자가 입력한 숫자만큼 차감
			count++; //횟수 증가
			if(total < 0) { //total이 음수 일 때 
				break; //무한루프 탈출
			}
		}
		sc.close();
		System.out.println("게임오버"); //게임오버 문장 출력
		System.out.println("입력한 횟수 : "+count); //사용자가 숫자를 입력한 횟수 출력
	}
}
