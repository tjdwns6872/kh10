package com.kh.spring12.entity;

public class PocketMonsterDto {
	//field	- 컬럼과 동일하게
	private int no;
	private String name;
	private String type;
	
	//기본생성자
	public PocketMonsterDto() {
		super();
	}

	//getter setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//toString
	@Override
	public String toString() {
		return "PocketMonsterDto [no=" + no + ", name=" + name + ", type=" + type + "]";
	}
	
}
