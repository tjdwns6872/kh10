package io;
import java.io.IOException;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) throws IOException {
		//System.in 만을 사용하여 입력을 받는 예제
		//문제점
		// - 하나의 명령이 한 글자만 입력 받는다.
		// - 입력을 아스키코드표 숫자로 변환해서 받는다.
		// - 예외 처리를 해야 한다.
		// - 자료형을 선택할 수 없다.
		
		int a = System.in.read();
		System.out.println(a);
	}
}
