package oop.keyword7;

public class Client {
	private String name; //예금주
	private static double basic; //기본이율
	private double interest; //우대이율
	private long money; //잔액
	
	// static 전용 초기화 구문
	static {
		basic = 1.2;
	}
	
	//생성자에서는 static을 초기화할 필요가 없다(한 번만 초기화하도록 따로 설정)
	public Client(String name, double interest, int money) {
		this.setName(name);
		this.setInterest(interest);
		this.setMoney(money);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static double getBasic() {
		return basic;
	}
	public static void setBasic(double basic) {
		if(basic >= 0) {
			Client.basic = basic;
		}
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		if(interest >= 0) { 
			this.interest = interest;
		}
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void print() {
		System.out.println("< 내 집 마련 장기 적금 >");
		System.out.println("이름 : "+this.name);
		System.out.println("기본이율 : "+Client.basic+"%");
		System.out.println("우대 이율 : "+this.interest+"%");
		System.out.println("잔액 : "+this.money+"원");
		System.out.println();
	}
}
