package exception;
import java.util.*;
import java.util.regex.Pattern;
public class Test05_2 {
	public static void main(String[] args) {
		try {//Plan A
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.next();
			if(!Pattern.matches("^[가-힣]{2,7}$", name)) {
				//throw new Exception(); //강제 예외
				throw new Exception("이름은 한글 2~7글자로 작성해야 합니다.");
			}
			
			System.out.print("국어 : ");
			int korean = sc.nextInt();
			if(korean < 0 || korean > 100) {
				throw new Exception("국어점수는 0~100점으로만 설정 기능합니다.");
			}

			System.out.print("영어 : ");
			int english = sc.nextInt();
			if(english < 0 || english > 100) {
				throw new Exception("영어점수는 0~100점으로만 설정 기능합니다.");
			}
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			if(math < 0 || math > 100) {
				throw new Exception("수학점수는 0~100점으로만 설정 기능합니다.");
			}
			
			sc.close();
			
			int total = korean + english + math;
			float average = total / 3f;
			
			System.out.println("이름 : " + name);
			System.out.println("총점 : " + total + "점");
			System.out.println("평균 : " + average + "점");
		}
		catch(Exception e) {//Plan B
			if(e.getMessage() == null) {
				System.err.println("입력이 잘못되었습니다");
			}
			else {
				System.err.println("오류 : "+e.getMessage());
			}
		}
	}
}
