package condition2;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//Test01을 switch~case 구문으로 변경
	
		int direction = 9;
		
		switch(direction) {
		case 2:
			System.out.println("아래로 이동합니다.");
			break; //더이상의 실행을 멈추고 나가세요
		case 4:
			System.out.println("왼쪽으로 이동합니다.");
			break;
		case 6:
			System.out.println("오른쪽으로 이동합니다.");
			break;
		case 8:
			System.out.println("위로 이동합니다.");
			break;
		default:
			System.out.println("잘못된 입력");	
		}
	}
}
