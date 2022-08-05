package oop.modifier2;
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		/*oop.getter3 에서 풀었던 문제를 접근제한 키워드와
		 * 사용자 입력을 추가해서 1명의 정보를 생성 후 출력
		 * 학생 성적 정보
		 * 평균의 소수점 자리수는 신경쓰지 마세요
		 * 이름	학년	국어점수	영어점수	수학점수
		 * 마리오	1	90	80	70
		 * 루이지	1	85	85	83
		 * 쿠파	3	70	60	55
		 * 요구 사항
		 * 각 점수는 0점 이상 100점 이하일 경우에만 설정하도록 필터링 처리
		 * 정보 출력시 반드시 총점, 평균, 등급이 나오도록 구현
		 * 등급은 다음과 같이 계산합니다
		 * 90점 이상 100점 이하 : A
		 * 80점 이상 89점 이하 : B
		 * 70점 이상 79점 이하 : C
		 * 70점 미만 : F*/
		Scanner sc = new Scanner(System.in);
		/*오버 로딩을 활용해서 변수 없이 입력 가능한 코드
		Student a =new Student();
		System.out.print("이름을 입력하세요 : ");
		a.setName(sc.next());
		System.out.print("학년을 입력하세요 : ");
		a.setGrade(sc.nextInt();)
		System.out.print("국어점수를 입력하세요 : ");
		a.setKorean(sc.nextInt());
		System.out.print("영어점수를 입력하세요 : ");
		a.setEnglish(sc.nextInt());
		System.out.print("수학점수를 입력하세요: ");
		a.setMath(sc.nextInt());
		sc.close();*/
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("국어점수를 입력하세요 : ");
		int korean = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int english = sc.nextInt();
		System.out.print("수학점수를 입력하세요: ");
		int math = sc.nextInt();
		sc.close();
		
		Student s1 = new Student(name, grade, korean, english, math);
		
		s1.print();
	}
}