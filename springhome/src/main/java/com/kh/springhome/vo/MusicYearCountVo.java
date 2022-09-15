package com.kh.springhome.vo;

import java.sql.Date;

public class MusicYearCountVo {
	private Date year;
	private int cnt;
	
	public MusicYearCountVo() {
		super();
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "MusicYearCountVo [year=" + year + ", cnt=" + cnt + "]";
	}

	
}
