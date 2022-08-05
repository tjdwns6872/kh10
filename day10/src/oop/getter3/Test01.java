package oop.getter3;

public class Test01 {

	public static void main(String[] args) {
		/*학생 성적 정보
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
		Student s1 = new Student("마리오", 1, 90, 80, 70);
		Student s2 = new Student("루이지", 1, 85, 85, 83);
		Student s3 = new Student("쿠파", 3, 70, 60, 55);
		
		s1.print();
		s2.print();
		s3.print();
	}

}
