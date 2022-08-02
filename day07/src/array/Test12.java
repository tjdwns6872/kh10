package array;
public class Test12 {

	public static void main(String[] args) {
		/*다음 규칙에 따라 정렬을 구현하세요.
		 * 30, 10, 20, 50, 40을 저장할 배열을 만듭니다.
		 * 배열의 위치를 변경하여 10, 20, 30, 40, 50 순으로 저장될 수 있도록 만든 뒤 출력합니다
		 * 배열에서 가장 작은 값을 찾아 가장 왼쪽에 있는 데이터와 교체합니다
		 * 교체된 데이터의 위치는 제외하고 나머지 위치에서 가장 작은 값을 찾아 좌측 데이터와 교체합니다
		 * 데이터가 완전히 정렬될 때까지 반복합니다*/
		int[] num = new int[] {30, 10, 20, 50, 40}; //배열 선언
		int min = 0; //가장 낮은 인덱스 값 
		
		for(int i = 0; i < num.length; i++) { //0~num배열의 크기만큼 반복
			for(int j=i+1; j < num.length; j++) { //i+1~배열의 크기만큼 반복
				/*j=i+1를 하는 이유 가장 낮은 수부터 찾아서 배열에 차례대로 정렬하기 때문에*/
				if(num[min] > num[j]) { //만약 num[min]값이 num[j]값보다 클 때(시작 지점부터 가장 낮은 값을 찾는 코드)
					min = j; //min에 j를 대입
				}
			}
			int tmp = num[i]; //num[i]에 값을 새로운 변수에 저장
			num[i] = num[min]; //num[i]값을 num[min]값으로 변경
			num[min] = tmp; //tmp값 num[min]에 보관(다시 min값으로 탐색해야 되기 때문)
		}
		for(int i = 0; i < num.length; i++) { //배열 출력
			System.out.println(num[i]);
		}
	}
}
