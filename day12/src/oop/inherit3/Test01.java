package oop.inherit3;
public class Test01 {
	public static void main(String[] args) {
		/*다음 요구사항에 맞게 클래스 구조를 설계하고 객체 생성 후 가진 모든 기능을 실행하는 코드를 작성
		 * 요구사항
		 * 브라우저들을 클래스로 구현(크롬, 엣지, 웨일)
		 * 각각의 브라우저들은 다음 데이터와 기능이 존재
		 * 크롬(Chrome) 브라우저
		 * 주소를 저장할 수 있어야 한다(url) 1
		 * 새로고침 기능이 존재해야 한다(refresh) 2
		 * 페이지 이동 기능이 존재해야 한다(move) 3
		 * 개발자 도구 기능이 존재해야 한다(develop)
		 * 크롬스토어 기능이 존재해야 한다(chromeStore)
		 * 엣지(Edge) 브라우저
		 * 주소를 저장할 수 있어야 한다(url) 1
		 * 새로고침 기능이 존재해야 한다(refresh) 2
		 * 페이지 이동 기능이 존재해야 한다(move) 3
		 * 전체화면 기능이 존재해야 한다(fullScreen)
		 * 웨일(Whale) 브라우저
		 * 주소를 저장할 수 있어야 한다(url) 1
		 * 새로고침 기능이 존재해야 한다(refresh) 2
		 * 페이지 이동 기능이 존재해야 한다(move) 3
		 * 파파고 번역 기능이 존재해야 한다(papago)
		 * 네이버 검색 기능이 존재해야 한다(naverSearch)
		 * 모든 기능들은 실행 시 간단한 텍스트 메세지가 출력되어야 한다
		 * 예를 들어 페이지 이동 기능을 실행하면 "페이지 이동 기능 실행"이라고 화면에 표시되면 된다*/
		
		//상위 클래스는 객체 생성을 하지 않는다(추상적인 형태)
		//Browser a = new Browser();
		
		Chrome c = new Chrome();
		c.setUrl("https://www.google.com");
		c.refresh();
		c.move();
		c.develop();
		c.chromeStore();
		
		Edge e = new Edge();
		e.setUrl("https://www.naver.com");
		e.refresh();
		e.move();
		e.fullScreen();
		
		Whale w = new Whale();
		w.setUrl("http://kakao.com");
		w.refresh();
		w.move();
		w.papago();
		w.naverSearch();
		
		
	}
}
