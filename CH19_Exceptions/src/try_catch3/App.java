package try_catch3;

import java.util.Scanner;

public class App {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int number = getNumber();
		System.out.println("입력한 숫자 : " + number);
		scanner.close();
	}

	private static int getNumber() { // 숫자를 입력 받아서 리턴
		int number = 0;
		boolean isNumber = false;
		
		// 숫자를 입력할 때까지 반복
		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();
			
			try { 
				number = Integer.parseInt(line); // 문자열을 정수로 변환
				isNumber = true; // 숫자 입력됨
			} catch (NumberFormatException e) { // 예외 발생시 프로그램 종료가 아니라 여기로 이동
				System.out.println("숫자 입력이 아닙니다");
			}	
		} while(!isNumber);

		return number;
	}
}
