package random;
import java.util.*;
public class Test02 {
	public static void main(String[] args) {
		/*다음 랜덤값을 구하여 화면에 출력
		 * 주사위 1개를 던진 결과
		 * 로또번호 1개를 추첨한 결과(1~45)
		 * OTP번호 1개를 생성한 결과(6자리 정수)
		 * 동전을 던졌을 때 예상되는 결과(앞 또는 뒤 중 하나)
		 */
		Random rand = new Random();
		int dice = rand.nextInt(6)+1; //1부터 6개
		int lotto = rand.nextInt(45)+1; //1부터 45개
		int otp = rand.nextInt(1000000); //0 ~ 1,000,000
		//int otp = rand.nextln(900000)+100000;
		// - 약속 0은 '앞'로 간주하고, 1은 '뒤'로 간주한다
		int coin = rand.nextInt(2);
		
		System.out.println("dice : "+dice);
		System.out.println("lotto : "+lotto);
		System.out.println("otp : "+otp);
		if(coin == 0) {
			System.out.println("앞");
		}else {
			System.out.println("뒤");
		}
	}
}
