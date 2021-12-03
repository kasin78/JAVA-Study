package test; // 테스트용 패키지

import java.util.Random;

import application.RandomWord; // RandormWord는 application 패키지 안에 있음
                               // 따라서 import로 들고와야함

public class Test { 
	public static void main(String[] args) {
		// RandomWord r = new RandomWord();
		// r.getWords(); // 단어 50개 전부 출력
		// System.out.println(r.toString());
		
		// 랜덤으로 단어를 가져오는 방법
		Random random = new Random();
		
		String[] words = {"펭수", "고양이", "라이언", "늑대", "소"};
		
		for (int i = 0; i < 100; i++) {
			int randomIndex = random.nextInt(words.length); // 0 ~ 배열개수-1 랜덤으로 출력
			System.out.println(words[randomIndex]);
		}
	}

}
