package oop.inherit7;

public abstract class IPhone extends Phone{
	public IPhone(String name, String color) {
		super(name, color);
	}
	
	public abstract void siri(); //siri()라는 기능이 필요한데 구현은 나중에 하위클래스에서 구현(재정의)
	
}
