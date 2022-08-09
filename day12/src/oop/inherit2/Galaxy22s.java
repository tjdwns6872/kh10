package oop.inherit2;

//하위(서브, 자식) 클래스
// extends Phone 이라고 작성하면 Phone의 모든 내용을 상속받는다는 뜻
public class Galaxy22s extends Phone{
	//Phone에 있는 field 2개와 method 2개를 이미 가지고 시작한다.
	
	//고유 기능만 구현하면 끝
	public void samsungPay() {
		System.out.println("삼성페이");
	}
}
