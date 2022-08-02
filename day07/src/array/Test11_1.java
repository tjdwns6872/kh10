package array;
public class Test11_1 {
	public static void main(String[] args) {
		/*배열 뒤집기
		 * 30, 10, 20, 50, 40을 배열에 저장합니다
		 * 배열의 데이터를 순차적으로 출력합니다
		 * 배열의 모든 데이터의 위치를 반대로 변경합니다(result : 40, 50, 20, 10, 30)
		 * 변경된 데이터를 순차적으로 출력합니다
		 * 수정본*/
		int[] number = new int[] {30, 10, 20, 50, 40}; //배열 선언
		
		System.out.println("배열의 크기 : "+number.length);
		System.out.println("반복 횟수 : "+number.length/2);
		
		for(int i = 0; i < number.length/2; i++) {
			int other = number.length-i-1;
			//System.out.println("i = "+i+" , other = "+other);
			int backup = number[i];
			number[i] = number[other];
			number[other] = backup;
		}
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}