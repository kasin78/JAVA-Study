package application;

import java.util.Random;

public class Cards {
	// 보물 카드
	private int[] treasureCards = {1, 7, 13, 15, 2, 9, 11, 14, 4, 5, 3, 5, 17, 7, 11};
	// 위험 카드
	private String[] dangerCards = {"불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"};
	
	// 이번에 뒤집을 때 나오는 카드
	private int thisTreasure;
	private String thisDanger;
	
	private Random thisFlip = new Random();
	
	// 이번에 뒤집을 때 나오는 카드
	public void thisTurn() {
		thisTreasure = treasureCards[thisFlip.nextInt(treasureCards.length)];
		thisDanger = dangerCards[thisFlip.nextInt(dangerCards.length)];
	}

	public int getThisTreasure() {
		return thisTreasure;
	}

	public String getThisDanger() {
		return thisDanger;
	}

}
