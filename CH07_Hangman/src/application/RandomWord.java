package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장
	private String str = "responsibility salvation highlight criminal sequence incongruous conservative spokesperson congress professor expectation ghostwriter exchange superintendent conceive accountant promotion abortion division relinquish discovery frequency qualification recession incapable progressive inhabitant graduate anticipation beautiful constant conception ideology predator accessible waterfall dividend conventional sensitivity prevalence assembly paragraph qualified embarrassment multimedia inappropriate suspicion forestry question hemisphere";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 문자열 배열에 입력
	
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 영문 문자 배열 선언(철자를 맞추면 저장)
	
	private Random random = new Random();
	
	// 생성자에 랜덤 단어를 선택
	public RandomWord() {
		selectWord = words[random.nextInt(words.length)]; // words[words 배열의 길이만큼의 정수 중에서 무작위 숫자 하나 선정] 
		characters = new char[selectWord.length()]; // 선택 단어의 길이 만큼 문자 배열 크기를 생성		
	}
	
	// 현재 words 배열에 있는 전체 단어를 출력
//	public void getWords() {
//		for (String w : words) {
//			System.out.println(w);
//		}
//	}
	
	// 단어를 _로 출력
	public String toString() {
		// String text = "";
		StringBuilder sb = new StringBuilder();
		
//		characters[3] = 'x'; // 테스트
		for (char c : characters) {
//			if (c == '\u0000') { // 문자의 초기값이면 아직 맞추지 못한 문자, 문자형의 null값
//				sb.append("_");
//			}
//			else {
//				sb.append(c); // 맞춘 문자일 경우
//			}
			
			// 삼항 연산자로 출력
			sb.append(c == '\u0000' ? '_' : c); // 못 맞추면 _ 맞추면 c
			sb.append(' '); // 철자를 한칸씩 스페이스바
		}
//		System.out.println(selectWord); // 정답출력 (테스트용)
		return sb.toString(); // 선택된 랜덤 단어를 가져온다
	}

	// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
	public void addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) { // 단어 길이만큼 반복
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}
	
	public boolean isCompleted() {
		// 철자를 다 맞췄는지 체크해서 true or false로 리턴
		for (char c : characters) { // 단어 전체 철자 반복 검사
			if (c == '\u0000') {
				return false; // 아직 맞춰야할 문자가 있음
			}
		}
		return true; // 다 맞췄음
	}
}









