package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cards {
	// 보물 카드 리스트
	// private int[] treasureCards = {1, 7, 13, 15, 2, 9, 11, 14, 4, 5, 3, 5, 17, 7, 11};
	
	private List<Integer> treasureCards;
	
	// 위험 카드 리스트
	// private String[] dangerCards = {"불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"};
	
	private ArrayList<String> dangerCards;
	
	// 이번에 뒤집을 때 나오는 카드
	private int thisTreasure;
	private int thisTreasureIndex;
	
	private String thisDanger;
	private int thisDangerIndex;
	
	// 각 리스트에서 무작위 선택
	private Random random = new Random();
	
	public Cards() {
		if(treasureCards == null) {
			treasureCards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 7, 7, 9, 11, 11, 13, 14, 15, 17));
		}
		if(dangerCards == null) {
			dangerCards = new ArrayList<>(Arrays.asList("불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"));
		}
	}
		
	// 뒤집는 메소드
	public void thisTurn() {
// 		thisTreasure = treasureCards[thisFlip.nextInt(treasureCards.length)];
// 		thisDanger = dangerCards[thisFlip.nextInt(dangerCards.length)];
		
		thisTreasureIndex = random.nextInt(treasureCards.size());
		thisTreasure = treasureCards.get(thisTreasureIndex);
			
		thisDangerIndex = random.nextInt(dangerCards.size());
		thisDanger = dangerCards.get(thisDangerIndex);
			
		// 뽑혔던 카드는 리스트(카드덱)에서 제거		
		treasureCards.remove(thisTreasureIndex);
		dangerCards.remove(thisDangerIndex);
			
		// 카드 다 뽑으면 카드덱 다시 만들기
		if (treasureCards.isEmpty()) {
			treasureCards.addAll(Arrays.asList(1, 2, 3, 4, 5, 5, 7, 7, 9, 11, 11, 13, 14, 15, 17));
			System.out.println("보물 카드덱을 다시 만듭니다");
		}
		else if (dangerCards.isEmpty()) {
			dangerCards.addAll(Arrays.asList("불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"));
			System.out.println("위험 카드덱을 다시 만듭니다");
		}
		
	}
	
	// 뽑힌 포인트 가져오기
	public int getThisTreasure() {
		return thisTreasure;
	}
	
	// 뽑힌 위험 가져오기
	public String getThisDanger() {
		return thisDanger;
	}

}
