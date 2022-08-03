package array2d;

import java.util.*;
public class Test05 {

	public static void main(String[] args) {
		/*Test03번과 동일하게 줄과 칸 수를 입력받아 2차원 배열을 생성하고 
		 * 초기화는 대각선 방향으로 하세요
		 * 줄 수 : 3
		 * 칸 수 : 4
		 * 1		3		6		9
		 * 2		5		8		11
		 * 4		7		10		12*/
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : "); 
		int line = sc.nextInt(); 
		System.out.print("칸 수 : ");
		int cannes = sc.nextInt();
		int[][] number = new int[line][cannes];
		int n = 1;
		// - x위치와 y위치의 합계가 0~5까지인 경우를 찾아서 대입(벗어나는 경우 제외)
		for(int i = 0; i <= (line-1)+(cannes-1); i++) {
			System.out.println("합계 : "+i);
			for(int k = i; k >= 0; k--) {
				//if(줄이 범위를 벗어나지 않으면서 칸이 범위를 벗어나지 않는다면){
				if(k < line && (i-k) < cannes) {					
					//System.out.println("k : "+k+", 반대 : "+(i+k));
					System.out.println("("+k+","+(i-k)+")");
					number[k][i-k] = n++;
				}
			}
		}
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < cannes; j++) {
				System.out.print(number[i][j]+"\t");
			}
			System.out.println();
		}
		//sc.close();
	}
}
