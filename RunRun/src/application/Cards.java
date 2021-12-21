package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cards {
	// 보물 카드 리스트
	// private int[] treasureCards = {1, 7, 13, 15, 2, 9, 11, 14, 4, 5, 3, 5, 17, 7, 11};
	
	private List<Integer> treasureCards = new ArrayList<>(Arrays.asList(1, 7, 13, 15, 2, 9, 11, 14, 4, 5, 3, 5, 17, 7, 11));
	private List<Integer> treasureCards2 = treasureCards; 
	
	// 위험 카드 리스트
	// private String[] dangerCards = {"불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"};
	
	private List<String> dangerCards = new ArrayList<>(Arrays.asList("불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"));
	private List<String> dangerCards2 = dangerCards; 
	
	// 이번에 뒤집을 때 나오는 카드
	private int thisTreasure;
	private String thisDanger;
	
	// 각 리스트에서 무작위 선택
	private Random random = new Random();
		
	// 뒤집는 메소드
	public void thisTurn() {
// 		thisTreasure = treasureCards[thisFlip.nextInt(treasureCards.length)];
// 		thisDanger = dangerCards[thisFlip.nextInt(dangerCards.length)];
						
		// 카드덱에서 무작위 하나 뽑기
		thisTreasure = treasureCards2.get(random.nextInt(treasureCards2.size()));
		thisDanger =  dangerCards2.get(random.nextInt(dangerCards2.size()));;
		
		// 뽑혔던 카드는 리스트(카드덱)에서 제거
		treasureCards2.remove(thisTreasure);
		dangerCards2.remove(thisTreasure);
		
		// 카드 다 뽑으면 카드덱 다시 만들기
		if (treasureCards2.size() == 0) {
			treasureCards2.addAll(treasureCards);
		}
		else if (dangerCards2.size() == 0) {
			dangerCards2.addAll(dangerCards);
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
