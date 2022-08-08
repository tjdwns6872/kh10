package oop.keyword1;

public class Calculator {
	private int left;
	private int right;
	
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getAnswer() {
		return this.left * this.right;
	}
	public Calculator(int left, int right) {
		this.setLeft(left);
		this.setRight(right);
	}
}
