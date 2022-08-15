package exception;
import java.util.*;
import java.util.regex.Pattern;
public class Test05 {
	public static void main(String[] args) {
		/*사용자에게 이름, 국어점수, 수학점수, 영어점수를 입력받아 
		 * 총점과 평균을 구하는 프로그램을 만듭니다.
		 * 사용자가 입력을 잘못한 경우 잘못된 입력입니다. 
		 * 처음부터 다시 진행해주세요. 라는 메세지를 출력하고 
		 * 진행중인 프로그램을 종료합니다.
		 * 다음 상황에 해당하지 않으면 입력을 잘못한 것으로 간주합니다.
		 * 이름은 한글로 2글자 이상 7글자 이하로 작성해야 합니다.
		 * 점수는 모두 0점이상 100점 이하의 정수인 경우만 가능합니다.
		 * 입력이 정상적으로 진행된 경우에는 이름, 총점, 평균을 출력해주세요.*/
		Scanner sc = new Scanner(System.in);
		int korean;
		int math;
		int english;
		int total;
		double ave;
		String regex = "^[가-힣]{2,7}$";
		while(true) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			boolean referee = Pattern.matches(regex, name);
			if(referee) {
				try {
					System.out.print("국어 점수 : ");
					korean = sc.nextInt();
					System.out.print("수학 점수 : ");
					math = sc.nextInt();
					System.out.print("영어 점수 : ");
					english = sc.nextInt();
					boolean score = korean>= 0 && korean<= 100;
					score &= math>= 0 && math <= 100;
					score &= english>= 0 && english<= 100;
					if(score) {
						total = korean + math + english;
						ave = total / 3.0;
					}else {
						System.err.println("점수를 잘못 입력하셨습니다.");
						continue;
					}
					System.out.println("이름 : "+name);
					System.out.println("총점 : "+total);
					System.out.println("평균 : "+ave);
					break;
				}catch (Exception e) {
					System.err.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
					continue;
				}
			}else {
				System.err.println("이름을 잘 못 입력하셨습니다.");
				continue;
			}
			
		}
	}
}
