package oop.inherit5;

public class AVI extends File{
	private int speed;
	public AVI(String fileName, int fileSize, int speed) {
		super(fileName, fileSize);
		this.setSpeed(speed);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void print() {
		System.out.println("< AVI >");
		System.out.println("파일 명 : "+super.fileName+".avi");
		System.out.println("파일크기 : "+super.fileSize+"MB");
		System.out.println("재생속도 : "+this.speed+"m/s");
		super.execute();
		super.forward();
		super.rewind();
		System.out.println();
		
	}
}
