package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cards {
	// 보물 카드 리스트
	private List<Integer> treasureCards;
	
	// 위험 카드 리스트
	private ArrayList<String> dangerCards;
	
	// 이번에 뽑힌 보물, 랜덤으로 뽑힌 보물 리스트 인덱스(정수)
	private int thisTreasure;
	private int thisTreasureIndex;
	
	// 이번에 뽑힌 위험, 랜덤으로 뽑힌 위험 리스트 인덱스(정수)
	private String thisDanger;
	private int thisDangerIndex;
	
	// 각 리스트에서 무작위 선택하게 해줄 랜덤 객체 생성
	private Random random = new Random();
	
	// 이번에 뽑힌 운
	private int luckTest;
	
	// 카드 클래스 생성과 동시에 보물 카드 리스트, 위험 카드 리스트 생성
	public Cards() {
		treasureCards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 7, 7, 9, 11, 11, 13, 14, 15, 17));
		dangerCards = new ArrayList<>(Arrays.asList("불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"));
	}
		
	// 이번턴 카드 뒤집는 메소드
	public void thisTurn() {
		// 0 혹은 1 무작위로 뽑힌 정수를 luckTest에 넣고 getter 메소드로 보내주기
		luckTest = random.nextInt(2);
		
		// 두 카드 리스트중 하나가 1장만 남을 경우 카드 리스트 다시 만들기
		if (treasureCards.size() == 1) {
			treasureCards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 7, 7, 9, 11, 11, 13, 14, 15, 17));
			System.out.println("보물 카드가 다 뽑혔습니다. 보물 카드덱을 다시 만듭니다");
		}
		if (dangerCards.size() == 1) {
			dangerCards = new ArrayList<>(Arrays.asList("불", "불", "불", "거미", "거미", "거미", "뱀", "뱀", "뱀", "좀비", "좀비", "좀비", "낙석", "낙석", "낙석"));
			System.out.println("위험 카드가 다 뽑혔습니다. 위험 카드덱을 다시 만듭니다");
		}
		
		/* luckTest, 0 = 위험 카드 드로우
				     1 = 보물 카드 드로우 */
		if ((luckTest == 1) && (treasureCards.size() > 0)) {
			// 무작위로 보물 리스트 사이즈 미만의 정수 하나 도출 
			thisTreasureIndex = random.nextInt(treasureCards.size());
			
			// 그 정수를 인덱스 번호로 하는 보물 리스트 데이터 도출해서 getter 메소드로 보내주기
			thisTreasure = treasureCards.get(thisTreasureIndex);
			
			// 뽑혔던 카드는 리스트에서 제거
			treasureCards.remove(thisTreasureIndex);
		}
		else if ((luckTest == 0) && (dangerCards.size() > 0)) {
			// 무작위로 위험 리스트 사이즈 미만의 정수 하나 도출
			thisDangerIndex = random.nextInt(dangerCards.size());
			
			// 그 정수를 인덱스 번호로 하는 위험 리스트 데이터 도출해서 getter 메소드로 보내주기 
			thisDanger = dangerCards.get(thisDangerIndex);
			
			// 뽑혔던 카드는 리스트에서 제거
			dangerCards.remove(thisDangerIndex);
		}
	}
	
	// 뽑힌 포인트 보내기
	public int getThisTreasure() {
		return thisTreasure;
	}
	
	// 뽑힌 위험 보내기
	public String getThisDanger() {
		return thisDanger;
	}
	
	// 뽑힌 운빨 보내기
	public int getluckTest() {
		return luckTest;
	}	
}
