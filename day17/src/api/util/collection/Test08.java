package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		/*네이버 사다리 만들기
		 * 네이버에서 사다리타기를 검색하여 나오는 프로그램을 그래픽 제외하고 구현*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		for(int i = 1; i <= person; i++) {
			System.out.print("입력 :" );
			list.add(sc.next());
		}
		List<String> list1 = new ArrayList<>();
		for(int i = 0; i < person; i++) {
			System.out.print("입력 :" );
			list1.add(sc.next());
		}
		
		System.out.println(list);
		System.out.println(list1);
		Collections.shuffle(list1);
		sc.close();
		for(int i = 0; i < person; i++) {
			System.out.println(list.get(i)+" -> "+list1.get(i));
		}
	}
}