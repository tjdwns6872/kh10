package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class User {
	private String id;
	private String pw;
	
	public User(String id, String pw) {
		this.setId(id);
		this.setPw(pw);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void getCom() {
		Map<String, String> idPw = new HashMap<>();
		idPw.put("testuser", "testuser1234");
		idPw.put("student", "student1234");
		idPw.put("manager", "manager1234");
		
		if(idPw.containsKey(this.id)&&idPw.get(this.id).equals(this.pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
