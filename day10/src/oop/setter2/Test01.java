package oop.setter2;
public class Test01 {

	public static void main(String[] args) {
		Lecture l1 = new Lecture("자바 마스터과정", 90, 1000000, "온라인");
		Lecture l2 = new Lecture("파이썬 기초", 60, 600000, "온라인");
		Lecture l3 = new Lecture("웹 개발자 단기완성", 120, 1200000, "오프라인");
		
		l1.print();
		l2.print();
		l3.print();
	}
}