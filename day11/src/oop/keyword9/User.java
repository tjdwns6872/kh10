package oop.keyword9;

public class User {
	private final String id;
	private String pw;
	private String nickname;
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	
	public User(String id, String pw, String nickname) {
		this.id = id;
		this.setPw(pw);
		this.setNickname(nickname);
	}
	
	public void pwprint() {
		System.out.print("비밀번호 : ");
		for(int i = 0; i < this.pw.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public void print() {
		System.out.println();
		System.out.println("< 사용자 정보 >");
		System.out.println("아이디 : "+this.id);
		pwprint();
		System.out.println("닉네임 : "+this.nickname);
		System.out.print("======================");
	}
}
