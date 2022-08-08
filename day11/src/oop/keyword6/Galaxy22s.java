package oop.keyword6;

public class Galaxy22s {
	// - 객체별로 관리되지 말아야 할 데이터에 static 키워드를 붙인다.
	// - 해당 static field의 getter/setter도 static 키워드를 붙인다.
	// - this를 통한 static field의 접슨은 권장하지 않는다.(경고)
	
	private static String company; //제조사
	private String color; //색상
	private String number; //전화번호
	private int memory; //메모리용량
	
	public Galaxy22s(String color, String number, int memory) {
		Galaxy22s.company = "삼성";
		this.color = color;
		this.number = number;
		this.memory = memory;
	}
	
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		Galaxy22s.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	public void print() {
		System.out.println(Galaxy22s.company);
		System.out.println(this.color);
		System.out.println(this.number);
		System.out.println(this.memory);
		System.out.println();
	}
	
	
}