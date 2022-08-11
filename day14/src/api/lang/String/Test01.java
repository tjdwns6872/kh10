package api.lang.String;

public class Test01 {
	public static void main(String[] args) {
		//String - 문자열을 다루는 클래스
		String a = "hello";
		System.out.println("a = "+a);
		
		char[] ch = new char[] {'h','e','l','l','o'};
		String b = new String(ch);
		System.out.println("b = "+b);
		
		String c = new String("hello");
		System.out.println("c = "+c);
		
		String d = "hello";
		
		//문자열 비교
		System.out.println(a == b); //a와 b가 정확히 일치하는 객체인가
		System.out.println(a.equals(b)); //a와 b가 값이 같은가
		System.out.println(a == d);
		
		//문자열에는 대소문자가 있다.
		String e = "JAVA";
		String f = "Java";
		System.out.println(e.equals(f));
		
		//문자열에는 대소문자가 있다.
		
		//1 대/소문자로 변환 후 비교
		System.out.println(e.equals(f.toUpperCase())); //e값을 f값을 대문자로 변환 후 비교
		
		//2 대소문자 무시하고 비교
		System.out.println(e.equalsIgnoreCase(f));
		
		
		
		
		
		
		
		
		
		
	}
}
