package api.lang.String;

public class Test04 {
	public static void main(String[] args) {
		//기타 문자열 명령
		String a = "안녕하세요";
		
		//한 글자 추출
		System.out.println(a.charAt(0)); //a의 0번째 index 글자를 반환
		
		//반복문으로 한 글자씩 출력
		for(int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
		//글자 자르기
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,4));
		
		//반복
		String b = "hello!";
		System.out.println(b.repeat(5));
		
		//치환
		String c = "나는 피자가 좋아요";
		System.out.println(c);
		System.out.println(c.replace("피자", "자바"));
		System.out.println(c.replace("피자", "**"));

		
		
		
	}
}
