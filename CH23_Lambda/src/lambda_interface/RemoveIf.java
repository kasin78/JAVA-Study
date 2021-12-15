package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		
	// 리스트 numbers 안에 있는 정수들 중에 6보다 작으면 다 제거
	// removeIf 메소드는 predicate로 검사(test)해서 true면 다 제거한다
		/* numbers.removeIf(new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i < 6; //정수가 6보다 작으면 true
			}
		}); */
		
		// 람다식으로 표현
		numbers.removeIf(i -> i < 6);
		numbers.forEach(x -> System.out.println(x));
		
	System.out.println("=================");
		
		List<String> friends = new ArrayList<>();
		
		friends.add("하나둘");
		friends.add("하나둘셋");
		friends.add("하나둘");
		friends.add("하나둘셋넷");
		
		// 문자열 길이가 4보다 작으면 다 제거 => 필터 역활
		friends.removeIf(s -> s.length() < 4);
		friends.forEach(s -> System.out.println(s));
	}
}
