package application;

import java.util.Random;
import java.util.Scanner;

public class Rule {
	
	// 갈지 말지 y or n 대답할 스캐너 객체
	Scanner stopGo = new Scanner(System.in);
	
	// y or n으로만 결정되기 때문에 대문자가 입력되더라도 소문자로 전환시켜줌
	String Lucky = stopGo.nextLine().toLowerCase();
	
	// 0 ~ 99까지 랜덤으로 한 수를 뽑아 35 미만이면 위험 카드 드로우
	//									35 이상이면 보물 카드 드로우
	Random LuckTest = new Random();
	
	// 이번 회차 탐험 모은 포인트
	int thisPoint = 0;
	// 총합 포인트
	int totalPoint = 0;
	
	public void run() {
		flipCard();
	}

	private void flipCard() {
		System.out.println("탐험을 시작합니다 ...");
		
		for (int i = 0; i < 6; ++i) {
			System.out.printf("%d번째 탐험을 시작합니다", i);
			System.out.printf("탐험을 계속하시겠습니까? (y/n) %s", Lucky);
			
			if (Lucky == "y") {
				happening();
				i--; // 이번 턴 무효
			}
			else if (Lucky == "n") {
				System.out.printf("%s번째 탐험을 종료합니다");
				settle();
			}
			else {
				System.out.println("y 혹은 n을 입력해주세요");
				i--; // 이번 턴 무효
			}
		}
	}

	private void happening() {
		int percent = LuckTest.nextInt(100);
		String LastDanger = null;
		
		System.out.println("탐험을 계속합니다");
		
		// 35 이상 보물 카드 드로우
		if (percent >= 35) {	
			Cards thisTime = new Cards();
			thisTime.thisTurn();
			
			System.out.printf("%d 포인트 보물입니다!", thisTime.getThisTreasure());
			thisPoint += thisTime.getThisTreasure();
		}
		// 35 미만 위험 카드 드로우
		else {		
			Cards thisTime = new Cards();
			thisTime.thisTurn();
			
			System.out.printf("%s입니다! 잠시 물러나서 탐험 여부를 다시 결정합시다", thisTime.getThisDanger());		
			// 연속으로 2번 같은 위험 카드가 나오는 것을 체크
			if (LastDanger == thisTime.getThisDanger()) {
				System.out.println("너무 위험합니다! 이번 탐험에서 모은 포인트를 버리고 탈출합니다");
				thisPoint = 0;
			}
			LastDanger = thisTime.getThisDanger();
		}
	}
	
	private void settle() {
		totalPoint = thisPoint;
		System.out.printf("이번 탐험에서 %s 포인트를 벌었습니다!", totalPoint);
	}
}
