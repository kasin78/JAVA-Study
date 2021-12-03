package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다
		// 패스워드가 맞으면 "접속 승인" 출력, 반복문 빠져나옴
		// 패스워드 3회 틀릴시 "접속 거부"
		
		final String USER_PASSWORD = "hello";
		String password = "";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false; // 플래그(flag) : 불린변수로 상태에 따라 처리흐름 제어
		
		for (int i = 1; i < 4; i++) {
			System.out.print("패스워드 입력 > ");
		    password = scanner.nextLine();
			
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속 승인");
				accessOK = true;
				break;
			} 
			else {
				System.out.printf("비번이 %d번 틀렸습니다. \n", i);
			}
		}
		
		scanner.close();
		
		if(!accessOK) { // if는 () 내용이 true일 때만 명령 실시, accessOK가 false 따라서 !accessOK는 true
						// password를 맞추게 되면 accessOK는 true가 되고 !accessOK는 false 따라서 이 조건문은 실행이 안됨
			System.out.println("접속 거부");
		}
			
		
		
		
		
	
	}

}
