package oop.modifier4;

public class Gun {
	int bullet;

	public int getBullet() {
		return bullet;
	}

	public void setBullet() {
		this.bullet = 2;
	}
	
	public void fire() {
		if(this.bullet > 0) {
			System.out.println("빵야");
			this.bullet--;
		}else {
			System.out.println("딸깍!");
		}
		System.out.println(this.bullet);
	}
	public void print() {
		System.out.println("남은 총알의 개수 : "+this.bullet);
	}
	public Gun() {
		this.setBullet();
	}
}
