package oop.multi2;

public class Box {
	
	//private Bus item; //버스를 한 개 저장할 수 있는 자리를 만들겠다
	//private Electronic item; //전자제품을 한 개 저장할 수 있는 자리를 만들겠다.
	//private Reserve item; //예약 가능한 제품을 한 개 저장할 수 있는 자리를 만들겠다.
	private Transportation item; //아무거나 한 개 저장할 수 있는 자리를 만들겠다.
	public void setItem(Transportation item) {
		this.item = item;
	}
	
	public Transportation getItem() {
		return this.item;
	}
}
