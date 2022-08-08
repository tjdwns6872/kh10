package oop.keyword6;

public class Test01 {
	public static void main(String[] args) {
		//휴대폰 생성
		Galaxy22s a = new Galaxy22s("아쿠아블루", "010-1212-3434", 256);
		Galaxy22s b = new Galaxy22s("실버", "010-2323-3434", 512);
		
		a.setMemory(512); //a의 메모리를 512로 교체
		a.setNumber("010-1111-2222"); //a의 번호를 교체
		a.setColor("블랙"); //a의 색상을 교체
		Galaxy22s.setCompany("애플"); //a의 제조사를 교체(?)
		
		a.print();
		b.print();
	}
}