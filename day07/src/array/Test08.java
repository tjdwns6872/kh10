package array;
public class Test08 {
	public static void main(String[] args) {
		//배열 데이터 교체(swap)
		int[] data = new int[] {30, 20, 10, 50, 40};

		//20과 40을 교체(맞교환은 안됨)
		//data[1] = data[4];
		//data[4] = data[1];
		
		int backup = data[1];
		data[1] = data[4];
		data[4] = backup;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
