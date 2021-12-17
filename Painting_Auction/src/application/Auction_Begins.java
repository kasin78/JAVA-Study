package application;

public class Auction_Begins {
	public static void main(String[] args) {
		/* 1. 랜덤으로 5 화가들 그림들중에 그림 5개를 받음
		 	  인원 : 플레이어와 컴퓨터 2명
		   2. 경매는 부여받은 그림중에 하나를 없애면서 시작
		      25% 확률로 컴퓨터는 경매에 참가하지 않음
		   3. 각 플레이어는 금화 100을 가짐
		   4. 총 3번 플레이되며 가장 많이 팔린 화가의 그림은 30
		   						2번째는 20
		   						3번째는 10
		   						나머지는 가치가 없음
		   5. 결과 정산후 승자 판정
		*/
		new Auction().run();
	}
}
