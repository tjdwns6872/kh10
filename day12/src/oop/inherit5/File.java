package oop.inherit5;

public class File {
	protected String fileName;
	protected int fileSize;
	
	public void execute() {
		System.out.println(this.fileName+"실행");
	}
	public void forward() {
		System.out.println("빨리감기");
	}
	public void rewind() {
		System.out.println("되감기");
	}
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		if(fileSize > 0) {
			this.fileSize = fileSize;
		}
	}
	public File(String fileName) {
		this(fileName, 0);
	}
	public File(String fileName, int fileSize) {
		this.setFileName(fileName);
		this.setFileSize(fileSize);
	}
}
