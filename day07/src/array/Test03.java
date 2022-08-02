package array;
public class Test03 {
	public static void main(String[] args) {
		//배열에 반복문을 사용
		
		int[] score = new int[5];
		
		score[0] = 55;
		score[1] = 75;
		score[2] = 80;
		score[3] = 65;
		score[4] = 99;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		int total = 0;
		for(int i= 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("총 점수 : "+total);
		
		double avg = (double)total / 5;
		System.out.println("평균 점수 : "+avg);	
	}
}
