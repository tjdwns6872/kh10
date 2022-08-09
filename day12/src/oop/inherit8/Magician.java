package oop.inherit8;

public class Magician extends Function{

	public Magician(String id) {
		super(id, 1);
	}
	public Magician(String id, int level) {
		super(id, level);
	}


	@Override
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("마법사가 날아서 이동합니다!");	
	}

	@Override
	public void information() {
		System.out.println("< 캐릭터 정보 >");
		System.out.println("마법사(magician)클래스");
		System.out.println("아이디 : "+super.id);
		System.out.println("레벨 : "+super.level);
		
	}
}
