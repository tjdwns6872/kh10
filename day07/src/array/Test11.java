package array;
public class Test11 {
	public static void main(String[] args) {
		/*배열 뒤집기
		 * 30, 10, 20, 50, 40을 배열에 저장합니다
		 * 배열의 데이터를 순차적으로 출력합니다
		 * 배열의 모든 데이터의 위치를 반대로 변경합니다(result : 40, 50, 20, 10, 30)
		 * 변경된 데이터를 순차적으로 출력합니다*/
		int[] number = new int[] {30, 10, 20, 50, 40}; //배열 선언
		int[] result = new int[number.length]; //위치를 반대로 변경 할 배열 선언
		int j = number.length-1; //배열에 크기를 변수로 선언
		
		for(int i = 0; i < number.length; i++) { //0~number배열에 크기만큼 반복
			System.out.println("number : "+number[i]); //배열 출력
			result[i] = number[j]; //result[i]에 number[j]값 대입
			j--; 
		}
		/*for(int i = 0; i < result.length; i++) {
			number[i] = result[i];
		}*/
		for(int i = 0; i < result.length; i++) {
			System.out.println("result : "+result[i]); //배열 출력
		}
	}
}