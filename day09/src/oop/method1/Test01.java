package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student();
		
		/*a.name = "피카츄";
		a.score = 90;
		System.out.println(a.name);
		System.out.println(a.score);*/
		
		a.setting("피카츄", 90);
		a.print();
		
		Student b= new Student();
		b.setting("라이츄", 95);
		b.print();
		
		Student c =new Student();
		c.setting("파이리", 55);
		c.print();
	}
}
