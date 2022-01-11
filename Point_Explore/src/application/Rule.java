package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Rule {
	// 갈지 말지 y or n 대답할 스캐너 객체
	Scanner stopGo = new Scanner(System.in);
	
	// 이번 회차 탐험 모은 포인트
	int thisPoint;
	
	// 총합 포인트
	int totalPoint;
	
	// 모험 시작?
	int turnCount;
	
	// 탐험 진행중?
	boolean isRunning;
		
	// 마지막 위험 기록할 리스트
	List<String> lastDangers = new ArrayList<>();
	
	// 뽑힌 카드 리스트
	List<String> shownCards = new ArrayList<>();
	
	// 카드 생성자 통해 카드 리스트 생성
	Cards thisTime = new Cards();
	
	public void run() {
		flipCard();
	}

	private void flipCard() {		
		for (int i = 1; i <= 5; i++) {
			if(i <= 4) {
				System.out.printf("┏━━━━━━ %s번째 탐험을 시작합니다 ━━━━━━━┓ \n", i);
				System.out.println("┃        Y : 탐험을 시작합니다         ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			}		
			else if (i == 5) {
				System.out.println("┏━━━━━━ 마지막 탐험을 시작합니다 ━━━━━━┓");
				System.out.println("┃        Y : 탐험을 시작합니다         ┃");
				System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			}
			
			// isRunning == false 제외하고 무한 반복
			do {
				// y or n으로만 결정되기 때문에 소문자가 입력되더라도 대문자로 전환시켜줌, trim으로 공백 제거
				String choice = stopGo.next().trim().toUpperCase();
				
				switch (choice) {
					case "Y":
						happening();
						turnCount = 1;
						break;
					case "N":
						settle();
						isRunning = false;
						turnCount = 0;
						break;
					default:
						if (turnCount == 0) {
							System.out.println("y를 입력하여 탐험을 시작하세요");
						}
						else {
							System.out.println("y 혹은 n을 입력해주세요");
						}
						isRunning = true;
						break;
				}
			} while (isRunning);
		}
		stopGo.close(); // 스캐너 종료
		
		// 점수 총합 계산(점수 자리수(1, 10, 100)에 따라 박스가 조금씩 달라짐)
		if (totalPoint < 10) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃ 모든 탐험이 끝났습니다! 당신의 총점은 %d 포인트입니다 ┃ \n", totalPoint);
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}
		else if ((totalPoint >= 10) && (totalPoint < 100)) {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃ 모든 탐험이 끝났습니다! 당신의 총점은 %d 포인트입니다 ┃ \n", totalPoint);
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}
		else { // totalPoint >= 100
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("┃ 모든 탐험이 끝났습니다! 당신의 총점은 %d 포인트입니다 ┃ \n", totalPoint);
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		}		
	}
	
	// 탐험 진행 메소드
	private void happening() {	
		System.out.println("탐험을 계속합니다.....");
			
		// 카드 뒤집는 메소드
		thisTime.thisTurn();
		
		// 운 테스트 50 이상 보물 카드 드로우
		if (thisTime.getluckTest() == 1) {		
			System.out.printf("💎 %d 💎 보물입니다! \n\n", thisTime.getThisTreasure());
			// 뽑힌 포인트 카드는 이번 회차 모은 포인트에 누적
			thisPoint += thisTime.getThisTreasure();
			System.out.println("     ┏━━━━ 탐험을 계속하시겠습니까? ━━━┓");
			System.out.println("     ┃ Y : 위험을 감수하고 계속합니다  ┃");
            System.out.println("     ┃ N : 이번 회차 탐험을 포기합니다 ┃");
            System.out.println("     ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            
            // 뽑힌 점수 리스트로 보여주기(정수 -> 문자열로 바꿔서 문자열 리스트에 넣기)         
            shownCards.add(String.valueOf(thisTime.getThisTreasure()));
            
            // 리스트 람다식 표현
            shownCards.forEach(list -> System.out.print(list + " / "));
            
	        // 현재까지 모은 포인트 보여주기
	        System.out.printf("\n현재까지 모은 보물 포인트 : %d \n", thisPoint);
	        
	        // 탐험은 계속
	        isRunning = true;    
		}
		
		// 운 테스트 50 미만 위험 카드 드로우
		else { // (thisTime.getluckTest() == 0)
			
			// LastDangers 리스트에 포함 돼있는 위험 카드가 또 나오는가 체크, 리스트에 같은 위험이 없는 경우
			if (!lastDangers.contains(thisTime.getThisDanger())) {
				System.out.printf("⚠ %s입니다! ⚠ 잠시 물러나서 탐험 여부를 다시 결정합시다 \n\n", thisTime.getThisDanger());
				System.out.println("     ┏━━━━ 탐험을 계속하시겠습니까? ━━━┓");
				System.out.println("     ┃ Y : 위험을 감수하고 계속합니다  ┃");
	            System.out.println("     ┃ N : 이번 회차 탐험을 포기합니다 ┃");
	            System.out.println("     ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	            
	            // 뽑힌 위험 리스트로 보여주기
	            shownCards.add(thisTime.getThisDanger());
	            
	            // 리스트 람다식 표현
	            shownCards.forEach(list -> System.out.print(list + " / "));
	            
	            // 현재까지 모은 포인트 보여주기
	            System.out.printf("\n현재까지 모은 보물 포인트 : %d \n", thisPoint);
	            
	            // 나온 위험 카드를 마지막 위험 리스트에 넣기
	            lastDangers.add(thisTime.getThisDanger());
	            
	            // 탐험은 계속
	            isRunning = true;
			}
			
			// LastDangers 리스트에 포함 돼있는 위험 카드가 또 나오는가 체크, 리스트에 같은 위험이 있는 경우
			else if (lastDangers.contains(thisTime.getThisDanger())) {
				System.out.printf("⚠ 이전에 나왔던 %s입니다! ⚠ 너무 위험합니다! 이번 탐험에서 모은 %d 포인트를 모두 잃어버리고 탈출합니다 \n\n", thisTime.getThisDanger(), thisPoint);
				
				// 위험으로 인한 이번 회차 모은 포인트 상실
				thisPoint = 0; 
				
				// 위험으로 인한 탐험 종료, 다음 탐험으로 넘어감
				isRunning = false;
				
				// 마지막 위험들 리스트 초기화
				lastDangers.removeAll(lastDangers);
				
				// 뽑힌 카드들 초기화
				shownCards.removeAll(shownCards);
			}	
		}
	}
	
	// 탐험 정리 메소드
	private void settle() {
		// 탐험 진행을 포기하면 그 회차에서 모은 포인트를 총합 포인트에 더하기
		totalPoint += thisPoint;
		System.out.printf("이번 탐험에서 💎 %s 💎 를 벌었습니다! \n\n", thisPoint);
		
		// 이번 회차 탐험 모은 포인트 초기화, 다음 탐험 시작 포인트 0
		thisPoint = 0;
		
		// 마지막 위험들 리스트 초기화
		lastDangers.removeAll(lastDangers);
		
		// 뽑힌 카드들 초기화
		shownCards.removeAll(shownCards);
	}
}
