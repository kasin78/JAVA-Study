package application;

import java.util.Scanner;

public class If_ElseIf_Else_Ex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("옵션을 선택 > ");
		int x = scanner.nextInt();
		scanner.close();
		
		// Else If문으로 표현
		/* if (x == 1) {
			System.out.println("헬로우");
		}
		else if (x == 2) {
			System.out.println("안녕 ?");
		}
		else if (x == 3) {
			System.out.println("프로그램 종료");
		}
		else {
			System.out.println("잘못된 옵션입니다");
		} */
		
		// Switch case문으로 표현
		switch (x) {
			case 1:
				System.out.println("헬로우");
				break;
			case 2:
				System.out.println("안녕 ?");
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 옵션입니다");
				break;		
		}
	}
}
