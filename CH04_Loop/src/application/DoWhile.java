package application;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행(조건이 명령문 뒤에 있기 때문)
		int count = 100;
		
		System.out.println("do while 반복문");
		
		do {
			System.out.println("Count : " + count);
		} while (count++ < 5); // count가 100이므로 이미 처음부터 조건이 false인데
							   // 조건식이 명령문 뒤에 있어서 처음 한번은 실행됨 */
		
		// do while 패스워드 체크
		final String USER_PASSWORD = "abc";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = ""; // 문자열 선언과 초기값을 공백(null)
		
		do {
			System.out.print("비번을 입력 > ");
			password = scanner.nextLine();
		} while (!password.equals(USER_PASSWORD)); // !true = false
												   // !false = true
		scanner.close();
		
		System.out.println("접속 승인");
	}
}
