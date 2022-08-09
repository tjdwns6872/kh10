package oop.inherit8;

public class Elf extends Function{

	public Elf(String id) {
		super(id, 1);
	}
	public Elf(String id, int level) {
		super(id, level);
	}

	@Override
	public void attack() {
		System.out.println("엘프가 활로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("엘프가 이동합니다!");
	}

	@Override
	public void information() {
		System.out.println("< 캐릭터 정보 >");
		System.out.println("엘프(elf)클래스");
		System.out.println("아이디 : "+super.id);
		System.out.println("레벨 : "+super.level);
	}
}
