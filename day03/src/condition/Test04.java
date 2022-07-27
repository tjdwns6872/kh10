package condition;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		/*4자리로 출생년도가 주어졌을 떼(ex:1995)
		이 사람이 지하철 무임승차 대상인지 확인해서 알려주도록 구현
		65세 이상의 어르신과 7세 이하 어린이 무임승차 대상입니다.*/
	
		int age = 1998;
		int now = (2022 - age)+1;
		int target1 = 65;
		int target2 = 7;
		
		boolean logic = target1 <= now || target2 >= now;
		System.out.println("대상의 현재 나이는 "+now+"세 입니다.");
		if(logic == true) {
			System.out.println("무임승차 대상입니다.");
		}else {
			System.out.println("무임승차 대상이 아닙니다.");
		}
		
	}
}
