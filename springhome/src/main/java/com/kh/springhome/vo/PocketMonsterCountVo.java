package com.kh.springhome.vo;

//VO(Value Object) - 값을 편하게 처리하기 위한 클래스
public class PocketMonsterCountVo {
	
	private String type;
	private int cnt;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public PocketMonsterCountVo() {
		super();
	}
	@Override
	public String toString() {
		return "PocketMonsterCountVo [type=" + type + ", cnt=" + cnt + "]";
	}
	
}
