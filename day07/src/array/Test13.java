package array;
public class Test13 {
	public static void main(String[] args) {
		/*Test12과 같은 데이터를 버블정렬(BUBBLE SORT)을 
		 * 통해 오름차순으로 정렬하고 출력해보세요
		 * 30, 10, 20, 50, 40을 저장할 배열을 만듭니다.*/
		int[] num = new int[] {30, 10, 20, 50, 40}; //배열 선언
		for(int i = 0; i < num.length; i++) { //0~num배열 크기만큼 반복
			for(int j = 0; j < num.length-1; j++) { //0~num배열의 크기만큼 반복
				if(num[j] > num[j+1]) { //만약에 num[j]보다 num[j+1]이 크다면
					int tmp = num[j]; //새로운 변수에 num[j]값을 저장
					num[j] = num[j+1]; //num[j]값을 num[j+1]값으로 변경 
					num[j+1] = tmp; //tmp값 보관
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]); //정렬한 배열 출력
		}
	}
}
