package com.kh.springhome.vo;


public class MusicYearCountVo {
	private int rank;
	private int year;
	private int cnt;
	
	public MusicYearCountVo() {
		super();
	}

	@Override
	public String toString() {
		return "MusicYearCountVo [rank=" + rank + ", year=" + year + ", cnt=" + cnt + "]";
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}


	
}
