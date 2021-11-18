package Basic;

import java.util.Scanner;

public class Example_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x의 값 : ");
		int x = scanner.nextInt();
		
		System.out.print("y의 값 : ");
		int y = scanner.nextInt();
		scanner.close();
		
		int multi = x * y;
		int div = x / y;
		int remainder = x % y;
				
		
		System.out.printf("곱하기 : %d X %d = %d\n", x, y, multi);
		System.out.printf("나누기 : %d / %d = %d\n", x, y, div);
		System.out.printf("나누기 나머지 : %d / %d = %d\n", x, y, remainder);
		
		
	}

}
