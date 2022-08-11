package api.lang.object;

public class Test01 {
	public static void main(String[] args) {
		//Object
		
		//객체 생성
		Object a = new Object();
		Object b = new Object();
		
		//필드 or 메소드 탐색
		System.out.println(a.toString()); //a의 요약정보
		System.out.println(b.toString()); //b의 요약정보
		
		System.out.println(a.hashCode()); //a의 일련번호
		System.out.println(b.hashCode()); //b의 일련번호
	}
}
