package array2d;
import java.util.*;
public class Test04 {
	public static void main(String[] args) {
		/*Test03번과 동일하게 줄과 칸 수를 입력받아 2차원 배열을 생성하고 
		 * 초기화는 세로 방향으로 하세요
		 * 줄 수 : 3
		 * 칸 수 : 4
		 * 1		4		7		10
		 * 2		5		8		11
		 * 3		6		9		12*/
		Scanner sc = new Scanner(System.in);
		int[][] number; //2차원 배열 생성
		System.out.print("줄 수 : "); 
		int line = sc.nextInt(); 
		System.out.print("칸 수 : ");
		int cannes = sc.nextInt();
		
		number = new int[line][cannes];
		int num = 1;
		for(int i = 0; i < cannes; i++) { //배열의 x축 만큼 반복
			for(int j = 0; j < line; j++) { //배열의 y축 만큼 반복
				number[j][i] = num++; //2차원 배열의 [i][j]칸에 num 값 대입 후 값을 1씩 증가
			}
		}
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < cannes; j++) {
				System.out.print(number[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
