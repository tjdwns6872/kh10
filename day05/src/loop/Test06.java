package loop;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		/*for(int i = 1; i <= 99; i++) {
			if(i % 7 == 0) {
				System.out.println("7의 배수 : "+i);
			}if(i % 10 == 5 || i / 10 == 5) {
				System.out.println("5가 들어간 숫자 : "+i);
			}
		}*/
		for(int i = 1; i <= 99; i++) {
			if(i % 7 == 0 && i % 10 == 5 || i % 7 == 0 && i / 10 == 5) { //7의 배수이면서 5가 들어간 숫자 출력
				System.out.println("7의 배수이면서 5가 들어간 숫자 : "+i);
			}else if(i % 7 == 0 && i % 10 != 5 && i / 10  != 5) { //7의 배수지만 5가 들어가 있지 않은 숫자 출력
				System.out.println("7의 배수 : "+i);
			}else if(i % 7 != 0 && i % 10 == 5 || i / 10 == 5) { //5가 들어간 숫자 출력
				System.out.println("5가 들어간 숫자 : "+i);
			}
		}
	}
}
