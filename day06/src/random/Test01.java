package random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//랜덤(Random)
		// - 무엇이 나올지 예측이 되지 않는 값
		// - 주사위, 로또, 게임아이템뽑기, ...
		// - 확률적인 형태가 구현 가능함
		// - 구현 방법은 여러 가지가 있다.
		//(1) Math.random() 명령 사용
		//(2) Random 도구 사용
		//(3) SecureRandom 도구 사용
		
		//(1) Math.random() 명령은 0이상 1미만의 double을 무작위로 만드는 명령
		//System.out.println(Math.random());
		
		//ex : 1부터 10사이의 랜덤값 추첨
		double a = Math.random();
		double b = a * 10; //0.xxx ~ 9.xxx
		int c = (int)b; //0~9
		int d = c+1; //1~10
		System.out.println("d = "+d);
		
		//공식 유도
		int num = (int)(Math.random()*10/*개*/)+1/*부터*/;
		System.out.println("num1 : "+num);
		
		//(2) Random이라는 도구를 만들어서 값 생성
		Random rand = new Random();
		int num2 = rand.nextInt(10/*개*/)+1/*부터*/;
		System.out.println("num2 : "+num2);
		
	}
}