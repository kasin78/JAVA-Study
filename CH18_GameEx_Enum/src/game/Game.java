package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;

public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = GameObject.values(); // enum의 상수들을 배열로 리턴
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.println("삼세판 게임 시작합니다 ...");
		int result = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번째 게임 시작 ...");
		    // 유저의 선택
			System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
			GameObject ob1 = objects[scanner.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			
			System.out.println("당신의 선택은 : " + ob1);
			System.out.println("컴퓨터 선택은 : " + ob2);
			
			int score = ob1.compare(ob2);
			result += score;
			// score 결과로 단판 결과 출력
			if (score > 0) {
				System.out.println("당신의 승리! 🚀");
			}
			else if (score == 0) {
				System.out.println("비겼습니다");
			}
			else { // (score < 0)
				System.out.println("당신의 패배 🏳");
			}
		}
		
		// 3번 가위바위보 끝난후
		// 총점 result로 결과 출력
		System.out.println();
		System.out.print("삼세판 결과 : ");
		if (result > 0) {
			System.out.print("당신의 승리! 🚀");
		}
		else if (result == 0) {
			System.out.print("비겼습니다");
		}
		else { // (result < 0)
			System.out.print("당신의 패배 🏳");
		}		
	}
}
