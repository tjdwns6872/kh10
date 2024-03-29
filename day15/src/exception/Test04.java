package exception;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		//예외를 통합 처리 했을 때 무슨 작업을 해야 하는가? 구분은 가능한가?
		
		try { //아무 문제 없을 때 실행될 코드(Plan A)
			Scanner sc = new Scanner(System.in);
			System.out.print("술 값 : ");
			int total = sc.nextInt();
		
			System.out.print("인원 : ");
			int people = sc.nextInt();
		
			sc.close();
		
			int price = total / people;
			int etc = total % people;
		
			System.out.println("1인당 "+price+"원");
			System.out.println("자투리 "+etc+"원");
		}
		catch (Exception e) { //Plan B
			//System.err.println("에러 발생");
			System.err.println(e); //예외 정보가 담긴 객체
			
			//예외 메세지 정보(사용자에게 보여줄 만한 정보, 없을 수도 있음)
			//System.err.println(e.getMessage()); 
			//System.err.println(e.getClass()); //예외 정보가 담긴 클래스 정보
			//구분을 원한다면 instanceof 대신 catch를 하나 더 만드는 것이 좋다.

			//예외 처리를 하지 않은 것처럼 stack trace를 출력하고 싶을 수도 있다.
			// -> 개발이 끝나면 삭제
			//e.printStackTrace();
		}
	}
}









