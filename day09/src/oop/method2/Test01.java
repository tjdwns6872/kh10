package oop.method2;

public class Test01 {

	public static void main(String[] args) {
		Name olympic = new Name();
		Name olympic1 = new Name();
		Name olympic2 = new Name();
		
		olympic.setting("진종오", "사격", "하계", 4, 2, 0);
		olympic1.setting("김수녕", "양궁", "하계", 4, 1, 1);
		olympic2.setting("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		olympic.print();
		olympic1.print();
		olympic2.print();
	}
}
