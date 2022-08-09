package oop.inherit8;

public abstract class Function extends Class{
	public Function(String id) {
		super(id, 1);
	}
	public Function(String id, int level) {
		super(id, level);
	}
	public abstract void attack();
	
	public abstract void move();
	
	public abstract void information();
	
	
}
