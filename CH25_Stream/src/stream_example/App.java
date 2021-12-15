package stream_example;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		// 스트림 : 배열 또는 컬렉션 인스턴수에 함수 여러개를 조합하여 
		//          원하는 결과를 필터링하고 가공된 결과를 얻을 수 있음
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		
		numbers.forEach(System.out::println);
		
		System.out.println("===============");
		
		numbers.stream()
		       .filter(n -> n > 5)
		       .map(n -> n * n)
			   .forEach(System.out::println);
	}
}
