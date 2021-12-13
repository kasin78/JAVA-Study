package application;

import java.util.Scanner;

public class CheckPassLimit_DoWhile {
	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다
		// 패스워드가 맞으면 "접속 승인" 출력, 반복문 빠져나옴
		// 패스워드 3회 틀릴시 "접속 거부"
		
		final String USER_PASSWORD = "hello";
		String password = ""; // 입력된 패스워드를 저장해줄 변수
		int count = 1; // 비밀번호 틀리는 카운트
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("패스워드를 입력하세요 > ");
			password = scanner.nextLine();
			if (count >= 4) {
				System.out.println("접속 거부");
				break;
			}
			else if (password.equals(USER_PASSWORD)) {
				System.out.println("접속 승인");
				break;
			} 
			else {
			System.out.printf("비번이 %d번 틀렸습니다\n", count);
			}
			count++;	
		} while (!password.equals(USER_PASSWORD));
		scanner.close();
	}
}
