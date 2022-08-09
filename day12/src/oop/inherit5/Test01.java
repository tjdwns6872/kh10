package oop.inherit5;
public class Test01 {

	public static void main(String[] args) {
		/*각종 파일들을 유형별로 구현
		 * MP3
		 * 파일명을 가지고 있어야 한다(fileName)
		 * 재생시간을 초단위로 가지고 있어야 한다(duration)
		 * 실행 기능을 가지고 있어야 한다(execute)
		 * 빨리감기 기능을 가지고 있어야 한다(forward)
		 * AVI
		 * 파일명을 가지고 있어야 한다(fileName)
		 * 파일크기를 가지고 있어야 한다(fileSize)
		 * 재생속도를 가지고 있어야 한다(speed)
		 * 실행 기능을 가지고 있어야 한다(execute)
		 * 되감기 기능을 가지고 있어야 한다(rewind)
		 * PPT
		 * 파일명을 가지고 있어야 한다(fileName)
		 * 파일크기를 가지고 있어야 한다(fileSize)
		 * 프레젠테이션 페이지 수를 가지고 있어야 한다(pageSize)
		 * 실행 기능을 가지고 있어야 한다(execute)
		 * 파일 정보 확인 기능을 가지고 있어야 한다(information)
		 * 모든 기능들은 실행 시 간단한 텍스트 메세지가 출력되어야 한다
		 * 예를 들어 MP3의 빨리감기 기능을 실행하면 "빨리감기 실행"과 같은 메세지가 출력되어야 한다.
		 * 모든 유형별 파일들을 객체 생성하고 보유한 기능들을 실행하세요*/
		
		MP3 m = new MP3("파일명", 1234, 123);
		AVI a = new AVI("파일명", 12313, 123);
		PPT p = new PPT("파일명", 1234, 12);
		
		m.print();
		a.print();
		p.print();		
	}
}