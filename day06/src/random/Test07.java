package random;
import java.util.*;
public class Test07 {
	public static void main(String[] args) {
		/*업다운 게임
		 * 숫자를 하나 정해두고 이를 맞추는 게임을 업다운 게임이라고 합니다.
		 * 프로그램이 랜덤으로 1에서 1000 사이의 숫자를 하나 정합니다.
		 * 사용자가 범위 내에서 숫자를 입력합니다.
		 * 프로그램은 사용자가 입력한 값과 정답을 비교해서 업, 다운, 정답 세 개중 하나를 알려줍니다.
		 * 업은 정답이 입력값보다 크다는 의미입니다.
		 * 다운은 정답이 입력값보다 작다는 의미입니다.
		 * 정답은 정답과 입력값이 같은 경우를 말하며, 게임이 종료되어야 합니다.
		 * 업다운 게임을 구현하시고 정답을 맞추면 몇번 만에 맞췄는지 계산해서 출력해주세요.*/
		Random rand = new Random(); //Random 객체 생성
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		int number = rand.nextInt(1000)+1; //1~1000까지 랜덤 값 설정
		while(true) { //무한루프
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt(); //사용자가 값 입력
			if(num == number) { //사용자가 입력한 값이 랜덤 값과 같다면
				break; //무한루프 탈출
			}else if(num > number) { //사용자가 입력한 값이 랜덤 값보다 크다면
				System.out.println("다운"); //다운 출력
			}else { //사용자가 입력한 값이 랜덤 값보다 작다면
				System.out.println("업"); //업 출력
			}
		}
		sc.close();
		System.out.println("정답");
	}
}
