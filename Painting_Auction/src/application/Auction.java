package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import painter.Edouard_Mane;
import painter.Edvard_Munch;
import painter.Gustav_Klimpt;
import painter.Paul_Cezanne;
import painter.Vincent_Van_Gogh;

public class Auction {
	private boolean running = true;
	private int money = 100;
	private int painterId;
	private String[] User = new String[5];
	private String[] PC = new String[5];
	private String[][] Card = {
			{"피리부는 소년", "에밀 졸라의 초상", "올랭피아", "풀밭 위의 점심식사", "폴리 베르제르의 술집"},
			{"절규", "흡혈귀", "불안", "카를 요한의 저녁", "여름 밤"},
			{"키스", "생명의 나무", "다나에", "부채든 여인", "유디트"},
			{"사과바구니가 있는 정물", "카드놀이하는 사람들", "어릿광대", "목욕하는 사람들", "사과와 오렌지"},
			{"별이 빛나는 밤", "자화상", "밤의 카페 테라스", "감자 먹는 사람들", "아를의 침실"}
	};
	
	Scanner pick = new Scanner(System.in);
	Random random = new Random();

	// 프로그램 실행
	public void run() {
		cards(); // 카드 섞어서 5장씩 나눠가지기
	}

	private void cards() {
		System.out.println("화가 및 카드를 건네받습니다...");
		HashSet<String> User = new HashSet<>();
		HashSet<String> PC = new HashSet<>();
		
		do {
			User.add(Card[random.nextInt(5)][random.nextInt(5)]);
			PC.add(Card[random.nextInt(5)][random.nextInt(5)]);
		} while (User.size() <= 5 && PC.size() <= 5);
		
		User.forEach(s -> System.out.println(s));
		PC.forEach(s -> System.out.println(s));
	}
	
		
	private void AuctionStart() {
		// TODO Auto-generated method stub
		
	}

	
}
