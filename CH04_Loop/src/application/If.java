package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 스캐너 가져오기
		Scanner scanner = new Scanner(System.in);
				
		// If 조건문
		// 조건이 true일 경우 {}안의 명령문 실행
			// if (조건문) {
			//    명령문
			// }
		
		int apple = 10;
		int banana = 5;
		
		if (apple < banana) {
			System.out.println("사과가 바나나보다 많음");
		}
			
		System.out.print("==============\n");
			
		System.out.print("오렌지의 갯수는? ");
		int orange = scanner.nextInt();
				
		System.out.print("복숭아의 갯수는? ");
		int peach = scanner.nextInt();
		
		// 스캐너 종료(더이상 사용 안 할때)
		scanner.close();
		
		if (orange > peach) {
			System.out.println("오렌지가 복숭아보다 많음");
		}
		if (orange < peach) {
			System.out.println("복숭아가 오렌지보다 많음");
		}
		System.out.println("프로그램 Shutdown");
	}
}
