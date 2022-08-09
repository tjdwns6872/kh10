package oop.inherit5;

public class PPT extends File{
	private int pageSize;
	
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public PPT(String fileName, int fileSize, int pageSize) {
		super(fileName, fileSize);
		this.setPageSize(pageSize);
	}
	public void information() {
		System.out.println("파일정보확인기능");
	}
	
	public void print() {
		System.out.println("< PPT >");
		System.out.println("파일 명 : "+super.fileName+".ppt");
		System.out.println("파일크기 : "+super.fileSize+"MB");
		System.out.println("페이지 수 : "+this.pageSize+"p");
		execute();
		information();
		System.out.println();
	}
}
