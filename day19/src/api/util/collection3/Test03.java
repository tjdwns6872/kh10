package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*검색엔진 검색어 수집기 만들기
		 * 검색엔진은 사용자가 입력한 정보를 수집하도록 설계되어 있습니다. 
		 * 이를 토대로 예측을 한다던가 다양한 방법으로 활용을 합니다. 빈도만 측정하려고 할 때, 
		 * 사용자에게 지속적으로 검색어를 입력받고 이를 카운팅하는 프로그램을 구현
		 * 주의사항
		 * 대문자 소문자를 무시하도록 구현하세요
		 * java와 j a v a는 같은 단어로 취급되도록 처리
		 * 검색어 입력 : 자바
		 * [자바] 검색이 완료되었습니다. 현재 검색횟수 [1]
		 * 검색어 입력 : 자바
		 * [자바] 검색이 완료되었습니다. 현재 검색횟수 [2]
		 * 검색어 입력 : 파이썬
		 * [파이썬] 검색이 완료되었습니다. 현재 검색횟수 [1]
		 * 검색어 입력 : 종료
		 * 검색 프로그램을 종료합니다.*/
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> word = new HashMap<>();
		
		while(true) {
			System.out.print("검색어 입력 : ");
			String search = sc.nextLine(); // 공백이 있을 경우를 위해 nextLine
			search = search.replaceAll(" ", ""); //공백 제거 코드
			search = search.toLowerCase(); //대문자를 소문자로 바꿔주는 코드
			
			if(search.equals("종료")) {
				break;
			}else if(!word.containsKey(search)){
				word.put(search, 1);
			}else if(word.containsKey(search)) {
				word.put(search, word.get(search)+1);
			}
			System.out.println(search+" 검색이 완료되었습니다. "
					+ "현재 검색횟수 "+word.get(search));
			
		}
		System.out.println("검색 프로그램을 종료합니다.");
		sc.close();
		
	}
}








