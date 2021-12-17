package application;

public class Explore_Begins {
	public static void main(String[] args) {
		/* 1. 카드 랜덤 한장 뒤집기
		   2. 포인트 카드가 나오면 계속 할지 말지 결정할 수 있음
		   	  위험 카드가 나오면 포인트는 없으면 계속 할지말지 결정할 수 있음
		   3. 위험 카드가 연속으로 2장 나오면 그 탐험 종료
		   4. 총 5번 탐험하며 합계 포인트 계산
		*/
		new Rule().run();
	}
}
