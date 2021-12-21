package application;

public class Explore_Begins {
	public static void main(String[] args) {
		/* 1. 카드 랜덤 한장 뒤집기
		   2. 포인트 카드가 나오면 포인트를 더하고 계속 할지 말지 결정할 수 있음
		   	  위험 카드가 나오면 추가 포인트는 없지만 계속 할지말지 결정할 수 있음
		   3. 위험 카드가 연속으로 2장 나오면 그 탐험 종료, 그 회차에 축적된 포인트는 0으로 돌아감
		   4. 총 5번 탐험하며 합계 포인트 계산
		*/
		//Rule start = new Rule();
		//start.run();
		new Rule().run();
		
		// 탐험 지속할 때 카운트 안 늘게만 하면 기본 완성
	}
}
