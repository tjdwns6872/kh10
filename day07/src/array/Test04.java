package array;
public class Test04 {
	public static void main(String[] args) {
		//배열에 반복문을 사용
		
		int[] score = new int[] {55, 75, 80, 65, 99};
		
		System.out.println(score.length);
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		int total = 0;
		for(int i= 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("총 점수 : "+total);
		
		double avg = (double)total / score.length;
		System.out.println("평균 점수 : "+avg);	
	}
}
