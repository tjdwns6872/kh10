package oop.inherit4;

public class IPhone14 extends Phone{
	public void print() {
		System.out.println("번호 : "+number);
		System.out.println("번호 : " +this.number);
		System.out.println("번호 : " +super.number);
	}
	//Phone의 test 메소드를 재정의(Override)
	// - 재정의는 원본과 동일하게 구현
	// - 재정의가 가능하다는 것은 원한다면 내용을 고쳐서 사용할 수도 있다는 뜻.
	// - if문이랑 같은 원리(인 듯?)
	@Override
	public void test() {
		System.out.println("재정의한 테스트");
	}
	
	//부모 클래스에 생성자가 있다면 
	//자식 클래스는 반드시 해당 생성자를 고려하여 생성자를 구현해야 한다.
	
	public IPhone14(String number) {
		super(number); //부모 클래스의 생성자로 number를 전달
	}
}
