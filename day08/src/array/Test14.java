package array;

public class Test14 {
	public static void main(String[] args) {
		//삽입 정렬(insertion sort)
		// - 모든 자리의 값을 순차적으로 백업 후 들어갈 자리를 만들어 삽입하는 정렬
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		for(int i = 0; i < data.length; i++) { 
			int backup = data[i]; //현재 위치(i)의 데이터를 백업
			int index = i; //현재 위치(i)를 들어갈 위치로 설정
			for(int j = i-1; j >= 0; j--) { //앞부분을 스캔하기 위한 반복문
				//System.out.println(index+", "+i);
				if(data[j] > backup) {
					data[j+1] = data[j]; //한칸 우측으로 복사
					index--; //들어갈 위치를 한 칸 왼쪽으로 조정
				}else {
					break; //중지
				}
			}
			//System.out.println(index);
			data[index] = backup;
		}
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
