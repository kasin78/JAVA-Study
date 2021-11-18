package application;

import java.util.Scanner;

public class If_ElseIf_Else_Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("옵션을 선택 > ");
		int x = scanner.nextInt();
		scanner.close();
		
		if (x == 1) {
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
		}

	}

}
