package loop;
public class Test02 {
	public static void main(String[] args) {
		//while 반복문 - 특정 시점까지 반복하는 반복문
		//for 반복문 - 횟수나 범위가 주어졌을 때의 반복문
		for(int i = 1; i <= 10; i++) { //1~10까지 반복 출력
			System.out.println(i);
		}
		
		int n = 1;
		while(n <= 10) { //1~10까지 반복 출력
			System.out.println(n);
			n++; //while문 증감식
		}
	}
}
