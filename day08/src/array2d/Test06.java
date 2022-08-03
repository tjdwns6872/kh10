package array2d;
import java.util.*;
public class Test06 {

	public static void main(String[] args) {
		/*다음 규칙에 따라 빙고판을 만드세요
		 * 5x5 크기의 정수 배열을 준비합니다
		 * 1부터 25까지의 숫자를 무작위 위치에 배치합니다
		 * 한 칸에는 한 번만 값을 배치할 수 있습니다
		 * 크기가 달라질 경우에도 달라진 크기에 맞게 빙고판이 만들어져야 합니다
		 * 크기 : 5
		 * 20		13		5		14		19
		 * 6		12		1		8		25
		 * 21		2		9		15		18
		 * 22		10		16		3		7
		 * 11		24		4		17		23*/
		
		//Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		//System.out.print("크기 : ");
		//int size = sc.nextInt();
		int size = 5;
		int[][] map = new int[size][size];
		//map.length와 map.length가 모두 size와 같다
		int num = 1;
		for(int i = 1; i<= size*size; i++) {
			int x = rand.nextInt(5);
			int y = rand.nextInt(5);
			if(map[x][y] == 0) {
				map[x][y] = i;
			}else {
				i--;
			}
		}
		for(int i = 0; i< size; i++) {
			for(int k = 0; k < size; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}