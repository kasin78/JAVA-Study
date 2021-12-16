package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {
	public static void main(String[] args) {
		// 정수형 스트림
		IntStream.range(0, 10) // 0이상 10 미만 정수, 1 <= x < 100
				 .skip(5)      // 5개 아이템(정수) 스킵(0 ~ 4)
				 .forEach(x -> System.out.println(x));

		System.out.println();
		
		int val = IntStream.range(1, 101) 
				           .sum(); // 1 ~ 100까지 정수의 합
								   // max, min, avg, count
		System.out.println(val);
	}
}
