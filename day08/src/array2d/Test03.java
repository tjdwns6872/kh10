package array2d;
import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		/*사용자에게 줄 수와 칸 수를 입력받아 해당하는 크기만큼의 2차원 배열을 생성하고
		 * 좌측 상단에 1부터 채워넣어 끝까지 1씩 증가하며 숫자가 채워지도록 구현하세요
		 * 구현 후 배열을 출력하세요*/
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		int[][] number; //2차원 배열 생성
		System.out.print("줄 수 : "); 
		int line = sc.nextInt(); 
		System.out.print("칸 수 : ");
		int cannes = sc.nextInt();
		number = new int[line][cannes]; //사용자에게 입력 받은 x,y축을 대입
		int num = 1; //칸 마다 숫자를 넣기 위한 변수 생성
		
		for(int i = 0; i < line; i++) { //배열의 y축 만큼 반복
			int total = 0; //배열의 x축 합계를 구하기 위한 변수 선언
			for(int j = 0; j < cannes; j++) { //배열의 x축 만큼 반복
				number[i][j] = num++; //2차원 배열의 [i][j]칸에 num 값 대입 후 값을 1씩 증가
				total += number[i][j]; //x축 합계 계산
				System.out.print(number[i][j]+"\t");
			}
			System.out.println();
			System.out.println("해당 줄에 합계는 "+total+" 입니다.");
		}
		sc.close();
	}
}