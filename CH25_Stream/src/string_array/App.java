package string_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		/* 리스트 => .stream()
		   리스트가 아닐 경우 (1) Stream.of(1, 2, 3,)     정수형 스트림
		                         Stream.of("하나", "둘") 문자열 스트림
		                      (2) 배열일 경우 Arrays.stream(배열입력) */
		
		// 리스트가 아닐 경우 - (1)
		Stream.of("Hello", "Bottle", "Africa")
		      .sorted()    // 정렬 : 알파벳순 (Africa, Bottle, Hello 순)
		      .findFirst() // 첫번째 (Africa)
		      .ifPresent(x -> System.out.println(x)); // 존재한다면 출력
		
		// 문자열 배열 스트림 - (2)
		String[] items = {"치킨", "원숭이", "고릴라", "치약", "고라니", "치약"};
		
		Arrays.stream(items)
			  .filter(s -> s.startsWith("치")) 
		      .forEach(s -> System.out.print(s + ", "));
		
		Stream.of(items) // 배열을 입력해서 스트림 생성
		      .filter(s -> s.startsWith("치")) // "치"로 시작하는 문자열들만 true
		      								   // filter는 true면 남기고 false면 제거
		      .forEach(s -> System.out.print(s + ", "));
		
	System.out.println();
	
		// 정수 배열 스트림 - (2)
		int[] numbers = {2, 4, 6, 8, 10};
		
		Arrays.stream(numbers)
			  .map(n -> n * n) // 제곱
			  .average()       // 평균, max() 최대, min() 최소
			  .ifPresent(n -> System.out.println(n));
	
	System.out.println();
		
		int[] nums = {9, 4, 6, 3, 1, 2, 7};
		
		Arrays.stream(nums)
		      .filter(n -> n > 3) // 9, 4, 6, 7
		      .sorted()           // 4, 6, 7, 9
		      .map(s -> s * 10)   // 40, 60, 70, 90
		      .forEach(x -> System.out.println(x));
		
	System.out.println();
	
		// 리스트 스트림 .stream()
		List<String> listItems = Arrays.asList(items);
		
		listItems.stream()
		         .filter(x -> x.startsWith("고")) // "고"로 시작되는 문자열들만 남김
		         .sorted()                        // 가나다순 정렬
		         .forEach(x -> System.out.print(x + ", "));
	}
}
