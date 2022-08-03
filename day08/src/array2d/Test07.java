package array2d;
import java.util.*;
public class Test07 {
	public static void main(String[] args) {
		/*다음 규칙에 따라 지뢰찾기를 만드세요
		 * 9x9 크기의 정수 배열을 준비합니다
		 * 지뢰는 9로 표시하며, 배열 내에 무작위로 20개가 배치됩니다
		 * 배치된 이후 전체 지도를 출력하세요
		 * 아래의 내용은 추가 문제이며 따로 풀이하지 않습니다

		 * 지뢰를 제외한 나머지 칸은 자신을 제외한 반경 8칸의 지뢰 개수를 세어 숫자를 기록해야 합니다
		 * 가장자리에 있는 칸의 경우 배열을 벗어나는 부분을 제외하고 계산해야 합니다
		 * 반경에 지뢰가 하나도 없다면 0이 설정됩니다*/
		
		int size = 9;
		int[][] mine = new int[size][size];
		Random rand = new Random();
		
		for(int i = 0; i < 20; i++) {
			int x = rand.nextInt(size);
			int y = rand.nextInt(size);
			if(mine[x][y] == 0) {
				mine[x][y] = 9;
			}else {
				i--;
			}
		}
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++) {
				System.out.print(mine[i][k]+"\t");	
			}
			System.out.println();
		}
	}
}
