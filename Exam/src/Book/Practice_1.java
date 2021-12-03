package Book;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 합을 구하여 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int total = x + y;
		
		System.out.printf("%d+%d은 %d", x, y, total);
		
				

	}

}
