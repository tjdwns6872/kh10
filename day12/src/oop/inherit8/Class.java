package oop.inherit8;

public class Class {
	protected String id;
	protected int level;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level > 0) {
			this.level = level;
		}
	}
	public Class(String id, int level) {
		this.setId(id);
		this.setLevel(level);
	}
}
