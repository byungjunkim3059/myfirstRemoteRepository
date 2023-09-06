package collection1;

import java.util.ArrayList;

public class ListTest1_1 {
	
	public static void main(String[] args) {
		
		// list ~~ changed
		// list ~~ changed2	
		// 자료의 갯수를 고정하지 않은 상태에서 저장하는 자료구조는 List (인터페이스)
		
		// List 인터페이스를 구현한 ArrayList가 있다.
		// ArrayList 객체를 만들어보겠습니다.
		
		
		// generic 포괄적인 <>쓰시고, 기본형을 객체로 감싼 타입인 wrapper 클래스인 Integer, Double
		// <Integer>로 받겠다.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println(arrayList);
		arrayList.add(30);
		System.out.println(arrayList);
		
		arrayList.add(40);
		System.out.println(arrayList);

		arrayList.add(50);
		System.out.println(arrayList);
		
		arrayList.add(60);
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		
		// 1) 인덱싱으로 값 가져오기. 누적은 좀 더 배운 후
		int tot = 0; // .size는 함수라서 뒤에 () 써주기
		for(int i = 0; i < arrayList.size(); i++) {
			tot += arrayList.get(i);
		}
		System.out.println(tot);
		
		
		// 2) 향상된 for문 사용
		tot = 0;
		for(int arr:arrayList) {
			tot += arr;
		}
		System.out.println(tot);
				

		
		String arr[] = new String[3];
		int a = arr.length; // length는 뭐지??
	}
	
}
