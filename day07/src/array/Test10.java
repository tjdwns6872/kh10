package array;
import java.util.*;
public class Test10 {
	public static void main(String[] args) {
		/*점심 메뉴 추첨 프로그램
		 * 사용자에게 입력할 메뉴의 개수를 입력받아 
		 * 해당 크기만큼의 배열을 생성합니다
		 * 생성된 배열에 점심메뉴를 입력합니다
		 * 입력이 완료되면 입력된 메뉴 중에서 랜덤으로 
		 * 한 개의 메뉴를 추첨한 뒤 출력합니다*/
		String[] menu; //메뉴를 받을 변수 문자열로 선언
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		Random rand = new Random(); //Random 객체 생성
		System.out.print("메뉴의 개수를 입력하세요 : ");
		int num = sc.nextInt(); 
		menu = new String[num]; //입력받은 num값만큼 크기의 배열 선언
		for(int i = 0; i < menu.length; i++) { //0~menu배열의 크기만큼 반복
			System.out.print("메뉴를 입력하세요 : ");
			menu[i] = sc.next(); //메뉴를 문자열로 입력
		}
		int number = rand.nextInt(menu.length); // number변수에 랜덤값 대입(0~menu배열 크기만큼)
		//System.out.println(number);
		System.out.println("추첨된 메뉴는 : "+menu[number]+" 입니다");
		
		sc.close();
	}
}
