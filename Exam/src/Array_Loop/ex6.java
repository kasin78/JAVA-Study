package Array_Loop;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// 입력값 받기
		System.out.print("숫자를 입력하시오 > ");
		Scanner scanner = new Scanner(System.in); 
		int number = scanner.nextInt();
		
		// 결과 출력
		printFactorial(number);
	}
	
	private static void printFactorial(int number) {
		int result = 1;
		System.out.printf("%d! = ", number);
		for (int i = number; i > 0; i--) {
			System.out.printf("%d", i);
			result = result*i;
			if (i != 1) {
				System.out.printf(" x ");
			}
		}
		System.out.printf(" = %d\n", result);
	}
}
