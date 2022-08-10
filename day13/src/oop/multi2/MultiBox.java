package oop.multi2;

//Generic type : 자료형을 미리 정해두지 않고 그때그때 정해서 사용할 수 있다.
public class MultiBox <E>{
	private E item;

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}
	
}
