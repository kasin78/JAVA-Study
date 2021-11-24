package application;

import java.util.Scanner;

public class NewArray2 {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성
		// int[] numbers = {}; 초기값을 바로 넣는 방법, 리터럴이라고 한다
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers; 
		numbers = new int[3]; 
			
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자를 입력 : ");
			numbers[i] = scanner.nextInt();
			total += numbers[i];
		}
		scanner.close();
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("Total : " + total);

	}

}
