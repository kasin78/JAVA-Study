package application;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// 스캐너 가져오기
		Scanner scanner = new Scanner(System.in);
						
		System.out.print("오렌지의 갯수는?");
		int orange = scanner.nextInt();
				
		System.out.print("복숭아의 갯수는?");
		int peach = scanner.nextInt();
		
		// 스캐너 종료(더이상 사용 안 할때)
		scanner.close();
		
		if (orange > peach) { // if 문의 조건이 true일 경우 실행할 명령
			System.out.println("오렌지가 복숭아보다 많음");
		}
		else { // if 문의 조건이 false일 경우 실행할 명령
			System.out.println("복숭아가 오렌지보다 많음");
		}
		System.out.println("프로그램 Shutdown");

	}

}
