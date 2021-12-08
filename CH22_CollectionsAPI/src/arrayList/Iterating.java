package arrayList;

import java.util.ArrayList;

public class Iterating {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); // 정수타입 리스트 생성
		
		// 리스트에 정수 추가
		list.add(7);   // 인덱스 0
		list.add(9);   // 인덱스 1
		list.add(123); // 인덱스 2
		
		// 1. for 반복문 사용 : 인덱스 번호가 필요할 때 사용
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + ": " + n);
		}
		
		// 2. for each문 사용 : 간단하게 출력
		for (int n : list) {
			System.out.println(n);
		}
		
		// 아직 안 배움 3. 컬렉션객체.forEach(각각 반복), 람다식
		list.forEach(e -> System.out.println(e));
		
		// 아직 안 배움 4. 메소드 레퍼런스
		list.forEach(System.out::println);
	}

}
