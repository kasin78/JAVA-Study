package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ReplaceAll {
	public static void main(String[] args) {
		// 리스트의 값을 연산결과로 대체한다
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);	
		
		/*numbers.replaceAll(new UnaryOperator<Integer>() {
			public Integer apply(Integer n) {
				return n*n;
			}
		}); */
		
		// 람다식 표현
		numbers.replaceAll(n -> n * n);	
		
		numbers.forEach(t -> System.out.println(t));
		
	System.out.println("==============");
	
		List<String> sList = new ArrayList<>();
		
		sList.add("펭수");
		sList.add("길동");
		sList.add("메리");
		
		sList.replaceAll(s -> "안녕! " + s);	
		sList.forEach(s -> System.out.println(s));
	}
}
