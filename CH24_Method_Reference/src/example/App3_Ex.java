package example;

import java.util.ArrayList;
import java.util.List;

public class App3_Ex {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);
		
		// 메소드 레퍼런스로 표현
		numbers.removeIf(App3_Ex::filter);
		numbers.replaceAll(App3_Ex::map);
		numbers.forEach(System.out::println);
	}
	
	private static boolean filter(int n) {
		return n < 5;
	}
	private static int map(int n) {
		return n * 2;
	}
}
