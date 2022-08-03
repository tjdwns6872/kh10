package array2d;

public class Test02 {
	public static void main(String[] args) {
		//2차원 배열
		
		int[][] a = new int[2][3];
		// a --> a[0] --> [0][0][[0]
		//   --> a[1] -->  [0][0][0]
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		int[][] b = new int[][] {
			{10, 20, 30},
			{40, 50, 60}};

		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
				}
			System.out.println();
			}						
	}
}
