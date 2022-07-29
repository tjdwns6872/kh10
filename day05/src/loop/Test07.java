package loop;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		for(int i =1; i <= 99; i++) {
			int won = i % 10;
			int ten = i / 10;
			if(won == 3 && ten == 3 || won == 6 && ten == 6 || won == 9 && ten == 9) {
				System.out.println("짝짝");
			}else if(won == 3 || won == 6 || won == 9 || ten == 3 || ten == 6 || ten == 9) {
				System.out.println("짝");
			}else {
			System.out.println(i);
			}
		}
	}
}

