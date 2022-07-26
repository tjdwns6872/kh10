package data;
import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
		//성적 평균 계산 예제
		int korean = 90;
		int english = 87;
		
		int total = korean + english;
		//double average = total / 2.0;
		//double average = total / 2d;
		double average = (double)total / 2; //변환(cast)연산
		
		System.out.println("시험 평균 점수: "+average);
	}
}
