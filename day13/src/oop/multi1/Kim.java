package oop.multi1;

//[접근제한자] [final] class [이름] [extends 클래스] [implements 인터페이스1, 인터페이스2]
public class Kim implements Singer, Magician{
	@Override
	public void sing() {
		System.out.println("죽을만큼 보고싶다~");
	}

	@Override
	public void show() {
		System.out.println("나와라 비둘기~");
	}
}
