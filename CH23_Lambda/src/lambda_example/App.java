package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		// 문자열 Arraylist 생성
		List<String> list = new ArrayList<>();
		
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		list.forEach(new Consumer<String>() {
			public void accept(String t) {
				// 익명 클래스에서 추상 메소드를 구현
				System.out.print(t + " ");
			}
		});
	System.out.println();
	
		// 익명 클래스를 람다식으로 표현
		list.forEach(t -> System.out.print(t + " "));	
	}
}
