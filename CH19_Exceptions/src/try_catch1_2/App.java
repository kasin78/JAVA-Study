package try_catch1_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 예외를 처리하는 try-catch문
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine();
		scanner.close(); // 스캐너 종료
		
		int number = 0;
		boolean isNumber = false;
		
		try { // 예외가 발생할 수 있는 코드를 적음, try ctrl + space, 
			  // alt 방향키 위로 이 코드 빼보고 실행하면 오류 발생
			number = Integer.parseInt(line); // 문자열을 정수로 변환
			isNumber = true;
				// Double.parseDouble(null); // 문자열을 실수로 변환
				// Float.parseFloat(null); // 문자열을 float 실수로 변환
		} catch (NumberFormatException e) { // 예외 발생시 프로그램 종료가 아니라 여기로 이동
			System.out.println("정수로 변환할 수 없습니다");
		}
		
		if (isNumber) {
			System.out.println("입력한 숫자 : " + number);
		}
	}

}
