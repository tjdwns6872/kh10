package oop.inherit5;

public class MP3 extends File{
	private int duration;
	public MP3(String fileName, int fileSize, int duration) {
		super(fileName, fileSize);
		this.setDuration(duration);
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void print() {
		System.out.println("< MP3 >");
		System.out.println("파일 명 : "+super.fileName+".mp3");
		System.out.println("파일 크기 : "+super.fileSize+"MB");
		System.out.println("재생 시간(초) : "+this.duration+"초");
		super.execute();
		super.forward();
		super.rewind();
		System.out.println();
	}
}
