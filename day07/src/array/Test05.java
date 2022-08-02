package array;
public class Test05 {
	public static void main(String[] args) {
		/*우리반 학생들의 시험 성적은 다음과 같습니다
		 * 75점, 92점, 86점, 65점, 79점, 95점, 88점, 86점, 72점, 77점
		 * 1. 전체 학생의 점수를 배열에 저장한 뒤 출력하세요
		 * 2. 전체 학생의 평균을 구하여 출력하세요
		 * 3. 성적 우수자(90점 이상)의 숫자를 카운트하여 출력하세요
		 * 4. 만약 이 반에 85점인 학생이 전학을 왔다면, 이 학생의 예상 등수는 몇 등인지 출력하세요*/
		
		int[] score = new int[] {75, 92, 86, 65, 79, 95, 88, 86, 72, 77}; //학생들의 성적을 배열에 대입
		int total = 0, count = 0, rank = 1; //총 점수, 성적우수자, 전학생 등수 변수 선언
		int transfer = 85; //전학생의 점수 선언
		for(int i = 0; i < score.length; i++) { //배열의 크기만큼 반복
			System.out.println(score[i]+"점"); //학생들의 성적 출력
			total += score[i]; //학생들의 총점 계산
			if(score[i] >= 90) { //학생들의 성적이 90점 이상일 때 성적 우수자 카운트 +1
				count++;
			}
			if(transfer < score[i]) { //전학생보다 성적이 높은 학생이 있으면 랭크 +1
				rank++;
			}
		}
		double avg = (double)total / score.length; //학생들의 총점을 배열의 크기만큼 나누어 평균 점수 계산
		System.out.println("평균 점수 : "+avg+"점"); // 평균 점수 출력
		System.out.println("성적 우수자는 "+count+"명 입니다."); //성적 우수자 출력
		System.out.println("전학생의 예상 등수는  "+rank+"등 입니다."); //전학생 예상 등수 출력
	}
}