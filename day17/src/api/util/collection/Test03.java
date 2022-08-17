package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		//주요 명령
		List<String> list = new ArrayList<>();
		
		//추가
		list.add("피카츄");
		list.add("파이리");
		list.add("꼬부기");
		list.add("라이츄");
		list.add("또가스");
		
		//검색
		System.out.println(list.contains("피카츄")); //있는지 없는지 true/false로 출력
		System.out.println(list.indexOf("꼬부기")); //위치 출력
		
		//2번 위치에 들어있는 것은?
		System.out.println(list.get(2)); //인덱스 위치에 있는 데이터 출력
		
		//삭제(피카츄 제거)
		list.remove("피카츄"); //데이터를 찾아 삭제
		list.remove(2); //인덱스 위치에 있는 데이터 삭제
		
		System.out.println(list);
		System.out.println(list.isEmpty()); //비어있는가
		System.out.println(list.size()); //데이터가 몇개인가
	}
}
