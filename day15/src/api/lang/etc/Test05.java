package api.lang.etc;

public class Test05 {
	public static void main(String[] args) {
		//String 합성(StringBuffer, StringBuilder)
		// -문자열의 덧셈이 성능이 좋지 않은 이유는 문자열이 불변(immutable)이기 때문
		
		//별 생성 코드
		
		//10개
		//String star = "";
		StringBuffer buffer = new StringBuffer();
		long a = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			buffer.append("*");
		}
		long b = System.currentTimeMillis();
		System.out.println(b - a);
		//System.out.println(star);
		//System.out.println(buffer.toString());
		
	}
}
