package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		/*
		 * 다음 요구사항에 따른 계산을 수행하여 결과를 출력하시오.
		 * 철수와 영희는 각자 국내에서 상영하는 영화를 다음과 같이 봤습니다. 철수 : 이상한 나라의 수학자, 더 배트맨, 인민을 위해 복무하라,블랙라이트 
		 * 영희 : 더 배트맨, 스파이더맨 : 노웨이 홈, 블랙라이트, 우리가 사랑이라고 믿는 것 
		 * (Q) 철수와 영희가 둘 다 본 영화 목록을 출력하세요 
		 * (Q) 철수와 영희 중 한 명만 본 영화 목록을 출력하세요
		 */
		
		Set<String> man = new TreeSet<>();
		Set<String> woman = new TreeSet<>();
		
		man.add("이상한 나라의 수학자");		woman.add("더 배트맨");
		man.add("더 배트맨");					woman.add("스파이더맨 : 노웨이 홈");
		man.add("인민을 위해 복무하라");		woman.add("블랙라이트");
		man.add("블랙라이트");					woman.add("우리가 사랑이라고 믿는 것");
		
		Set<String> sum = new TreeSet<>();
		sum.addAll(man);
		sum.addAll(woman);
		
		Set<String> subman = new TreeSet<>();
		subman.addAll(man);
		subman.removeAll(woman);
		
		Set<String> subwoman = new TreeSet<>();
		subwoman.addAll(woman);
		subwoman.removeAll(man);
		
		System.out.println("둘 다 본 영화 목록");
		System.out.println("============");
		for(String name : sum) {
			//System.out.println(sum);
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("철수만 본 영화");
		System.out.println("===========");
//		System.out.println(subman);
		for(String name : subman) {
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("영희만 본 영화");
		System.out.println("===========");
//		System.out.println(subwoman);
		for(String name : subwoman) {
			System.out.println(name);
		}
		System.out.println();
	}
}








