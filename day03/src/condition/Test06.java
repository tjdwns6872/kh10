package condition;
import java.lang.*;
import java.util.*;
public class Test06 {
	public static void main(String[] args) {
		/*과속단속 카메라 프로그래밍
		 * 다음 요구사항에 맞는 과속 단속 카메라용 프로그램을 구현하세요
		 * - 50km를 초과하는 속도로 달리는 자동차를 단속합니다.
		 * - 벌금은 제한속도보다 10km 늘어날 때마다 10000원씩 증가
		 * - 벌금은 시작이 30000원입니다.
		 * - 벌금은 최대 70000원입니다.
		 * 자동차 속도를 입력받아서 예상되는 벌금을 출력하는 프로그램을 구현*/
		Scanner sc = new Scanner(System.in);
		System.out.print("자동차의 속도를 입력하세요 : ");
		int km = sc.nextInt();
		int speed = 50;
		int basic = 30000;
		int fine;
		
		if(km > speed) {
			km -= speed;
			fine = basic + ((km/10)*10000);
			System.out.println("과속이 감지 되었습니다");
			if(fine > 70000) {
				fine = 70000;
			}
		}else {
			System.out.println("과속이 감지 않았습니다.");
			fine = 0;
		}System.out.println(fine+"원입니다.");
	}
}
