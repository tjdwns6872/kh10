package array;

public class Test01 {
	public static void main(String[] args) {
		//배열(Array)의 필요성
		
		// ex : 5개의 정수에 대한 처리
		int score1 = 50;
		int score2 = 75;
		int score3 = 80;
		int score4 = 65;
		int score5 = 99;
		
		System.out.println("점수 : "+score1);
		System.out.println("점수 : "+score2);
		System.out.println("점수 : "+score3);
		System.out.println("점수 : "+score4);
		System.out.println("점수 : "+score5);
		
		int total = score1 + score2 + score3 + score4 + score5;
		System.out.println("총점 : "+total);
		
		double avg = (double)total / 5;
		System.out.println("평균 : "+avg);
	}
}
