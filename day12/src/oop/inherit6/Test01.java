package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		/*요구사항
		 * Galaxy22s
		 * 전화번호 설정 가능
		 * 색상 설정 가능
		 * 전화(call) 기능을 실행하면 "갤럭시22s 전화 기능 실행" 출력
		 * 문자(sms) 기능을 실행하면 "갤럭시22s 문자 기능 실행" 출력
		 * 삼성페이(samsungPay) 기능을 실행하면 "갤럭시22s 삼성페이 기능 실행" 출력
		 * 빅스비(bixby) 기능을 실행하면 "갤럭시22s 음성인식 기능 실행" 출력
		 * GalaxyFold3
		 * 전화번호 설정 가능
		 * 색상 설정 가능
		 * 전화(call) 기능을 실행하면 "갤럭시폴드3 전화 기능 실행" 출력
		 * 문자(sms) 기능을 실행하면 "갤럭시폴드3 문자 기능 실행" 출력
		 * 삼성페이(samsungPay) 기능을 실행하면 "갤럭시폴드3 삼성페이 기능 실행" 출력
		 * 홍채인식(iris) 기능을 실행하면 "갤럭시폴드3 홍채인식 기능 실행" 출력
		 * IPhone12
		 * 전화번호 설정 가능
		 * 색상 설정 가능
		 * 전화(call) 기능을 실행하면 "IPhone12 전화 기능 실행" 출력
		 * 문자(sms) 기능을 실행하면 "IPhone12 문자 기능 실행" 출력
		 * 아이튠즈(itunes) 기능을 실행하면 "IPhone12 아이튠즈 기능 실행" 출력
		 * 시리(siri) 기능을 실행하면 "IPhone12 음성인식 기능 실행" 출력
		 * IPhone13
		 * 전화번호 설정 가능
		 * 색상 설정 가능
		 * 전화(call) 기능을 실행하면 "IPhone13 전화 기능 실행" 출력
		 * 문자(sms) 기능을 실행하면 "IPhone13 문자 기능 실행" 출력
		 * 페이스타임(faceTime) 기능을 실행하면 "IPhone13 영상통화 기능 실행" 출력
		 * 시리(siri) 기능을 실행하면 "IPhone13 음성인식 기능 실행" 출력*/
		
		Galaxy22s g2 = new Galaxy22s("010-2345-2345", "골드");
		g2.call();
		g2.sms();
		g2.bixby();
		g2.samsungPay();
		
		GalaxyFold3 g3 = new GalaxyFold3("010-1234-1234", "실버");
		g3.call();
		g3.sms();
		g3.iris();
		g3.samsungPay();
		
		IPhone12 i12 = new IPhone12("010-6666-6666", "실버");
		i12.call();
		i12.sms();
		i12.itunes();
		i12.siri();
		
		IPhone13 i13 = new IPhone13("010-7777-7777", "골드");
		i13.call();
		i13.sms();
		i13.faceTime();
		i13.siri();
	}
}
