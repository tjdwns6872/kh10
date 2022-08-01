package random;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
	/*랜덤으로 구구단 문제를 하나 출제하고 사용자가 정답을 입력하면 정답과 오답을 판정하는 프로그램을 구현하세요
	 * 단, 문제는 2x1부터 9x9의 범위 내에서 출제해야 합니다*/
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		Random rand = new Random(); //Random 객체 생성
		int den = rand.nextInt(8)+2; //랜덤으로 단 설정(2~9)
		int num = rand.nextInt(9)+1; //랜덤으로 인수 값 설정(1~9)
		
		System.out.print(den+" x "+num+" = "); //랜덤으로 구구단 출력
		int answer = sc.nextInt(); //사용자가 답 입력
		if(den * num == answer) { //사용자 입력 값이 답 과 같다면
			System.out.println("정답입니다."); //정답 출력
		}else { //답이 아니라면
			System.out.println("오답입니다."); //오답 출력
		}
		sc.close();
	}
}
