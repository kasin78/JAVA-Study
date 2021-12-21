package application;

import java.util.Random;
import java.util.Scanner;

public class Rule {
	// 갈지 말지 y or n 대답할 스캐너 객체
	Scanner stopGo = new Scanner(System.in);
	
	// y or n으로만 결정되기 때문에 대문자가 입력되더라도 소문자로 전환시켜줌
	// String choice = stopGo.nextLine().toLowerCase();
	
	// 0 ~ 99까지 랜덤으로 한 수를 뽑아 35 미만이면 위험 카드 드로우
	//									35 이상이면 보물 카드 드로우
	Random luckTest = new Random();
	
	// 이번 회차 탐험 모은 포인트
	int thisPoint;
	
	// 총합 포인트
	int totalPoint;
	
	// 카드 확률 0 ~ 99까지의 수 랜덤
	int percentage = luckTest.nextInt(100);
	
	// 마지막 위험 기록
	String LastDanger = null;
	
	public void run() {
		flipCard();
	}

	private void flipCard() {	
		for (int i = 1; i < 6; i++) {
			System.out.printf("%d번째 탐험을 시작합니다... \n", i);
			System.out.println("y : 위험을 감수하고 들어갑니다");
			System.out.println("n : 이번 회차 탐험을 포기합니다");
			
			// y or n으로만 결정되기 때문에 대문자가 입력되더라도 소문자로 전환시켜줌
			String choice = stopGo.next().toLowerCase();
				
			switch (choice) {
				case "y":
					happening();
					System.out.printf("%d번째 탐험을 계속하시겠습니까? \n", i);
					System.out.println("y : 위험을 감수하고 계속합니다");
					System.out.println("n : 이번 회차 탐험을 포기합니다");
					break;
				case "n":
					settle();
					break;
				default:
					System.out.println("y 혹은 n을 입력해주세요");
					--i; // 턴수 증가 방지
					break;
			}
//			if (choice == "y") {
//				happening();
//				i--; // 이번 턴 무효
//			}
//			else if (choice == "n") {
//				System.out.printf("%s번째 탐험을 종료합니다", i);
//				settle();
//			}
//			else {
//				System.out.println("y 혹은 n을 입력해주세요");
//				i--; // 이번 턴 무효
//			}
		}
		System.out.printf("모든 탐험이 끝났습니다! 당신의 총점은 %d 포인트입니다", totalPoint);
	}

	private void happening() {	
		System.out.println("탐험을 계속합니다");
		
		// 카드 한장 무작위로 뒤집기
		Cards thisTime = new Cards();
		thisTime.thisTurn();
		
		// 운 테스트 35 이상 보물 카드 드로우
		if (percentage >= 35) {		
			System.out.printf("%d 포인트 보물입니다! \n\n", thisTime.getThisTreasure());
			thisPoint += thisTime.getThisTreasure();
		}
		// 운 테스트 35 미만 위험 카드 드로우
		else { //(percentage < 35)					
			System.out.printf("%s입니다! 잠시 물러나서 탐험 여부를 다시 결정합시다 \n\n", thisTime.getThisDanger());		
			// 연속으로 2번 같은 위험 카드가 나오는 것을 체크
			if (LastDanger == thisTime.getThisDanger()) {
				System.out.println("너무 위험합니다! 이번 탐험에서 모은 포인트를 버리고 탈출합니다 \n\n");
				thisPoint = 0;
			}
			LastDanger = thisTime.getThisDanger();
		}
	}
	
	private void settle() {
		totalPoint += thisPoint;
		System.out.printf("이번 탐험에서 %s 포인트를 벌었습니다! \n\n", thisPoint);
	}
}
