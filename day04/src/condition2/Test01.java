package condition2;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//switch ~ case의 필요성
		// -if문은 순차적으로 검사해야 실행되는 특징을 가진다.
		// -동일한 실행속도가 필요한 상황이라면 문제가 발생.
		
		int direction = 2;
		
		if(direction == 2) {
			System.out.println("아래로 한 칸 이동");
		}else if(direction == 4) {
			System.out.println("왼쪽으로 한 칸 이동");
		}else if(direction == 6) {
			System.out.println("오른쪽으로 한 칸 이동");
		}else if(direction == 8) {
			System.out.println("위로으로 한 칸 이동");
		}else {
			System.out.println("잘못된 입력");
		}
	}
}
