package exception;
import java.util.*;
import java.util.regex.Pattern;
public class Test05_1 {
	public static void main(String[] args) {
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.next();
			if(!Pattern.matches("^[가-힣]{2,7}$", name)) {
				throw new Exception(); //강제 예외
			}
			
			System.out.print("국어 : ");
			int korean = sc.nextInt();
			if(korean < 0 || korean > 100) {
				throw new Exception();
			}

			System.out.print("영어 : ");
			int english = sc.nextInt();
			if(english < 0 || english > 100) {
				throw new Exception();
			}
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			if(math < 0 || math > 100) {
				throw new Exception();
			}
			
			sc.close();
			
			int total = korean + english + math;
			float average = total / 3f;
			
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + average + "점");
		}
		catch(Exception e) {//Plan B
			System.err.println("입력이 잘못되었습니다");
		}
	}
}
