package exception;

import java.util.regex.Pattern;

public class Student {
	private String name;
	private int korean, english, math;
	
	public String getName() {
		return name;
	}
	// throw - 예외를 발생시키는 코드
	// throws - 예외가 발생할 것이라고 경고하는 코드(예외 전가)
	// - 예와처리가 없는 상태로는 호출이 불가능한 메소드가 된다
	public void setName(String name) throws Exception {
		if(Pattern.matches("^[가-힣]{2,7}$", name)) {
			this.name = name;
		}
		else {
			throw new Exception("이름은 한글 2~7자로 작성하세요.");
		}
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) throws Exception {
		if(korean < 0 || korean > 100) {
			//return;
			throw new Exception("국어 점수는 0~100점으로만 설정 가능합니다.");
		}
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) throws Exception {
		if(english < 0 || english > 100) {
			//return;
			throw new Exception("영어 점수는 0~100점으로만 설정 가능합니다.");
		}
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) throws Exception {
		if(math < 0 || math > 100) {
			//return;
			throw new Exception("수학 점수는 0~100점으로만 설정 가능합니다.");
		}
		this.math = math;
	}
	
	public Student(String name, int korean, int english, int math) throws Exception {
		this.setName(name);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + "]";
	}
}
