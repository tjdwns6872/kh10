package oop.modifier4;

public class Police {
	public String name;
	public String position;
	public String region;
	Gun g = new Gun();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public void shoot() {
		if(this.name.equals("포돌이")) {
			for(int i = 0; i < 2; i++) {
				g.fire();				
			}
		}else if(this.name.equals("포순이")) {
			for(int i = 0; i < 1; i++) {
				g.fire();
			}
		}else if(this.name.equals("포그리")) {
			for(int i = 0; i < 3; i++) {
				g.fire();
			}
		}
	}
	
	public Police(String name, String position, String region) {
		this.setName(name);
		this.setPosition(position);
		this.setRegion(region);
	}	
	
	public void print() {
		System.out.println("< 경찰 근무정보 >");
		System.out.println("이름 : "+this.name);
		System.out.println("직급 : "+this.position);
		System.out.println("근무지역 : "+this.region);
		g.print();
		System.out.println("========================");
	}
}
