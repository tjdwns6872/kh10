package array;

import java.util.Arrays;

public class Test14_1 {
	public static void main(String[] args) {		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		Arrays.sort(data);
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
