package Java_Api;

import java.util.Random;

class LottoMachine {
	// 필드
	private int[] LottoNumbers;
	
	// 생성자
	public LottoMachine() {
		LottoNumbers = generate();
	}
	
	//메소드
	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random generator = new Random();
		
		// 임의의 숫자 6개 도출
		for (int i = 0; i < pickedNumbers.length; i++) {
			pickedNumbers[i] = generator.nextInt(46);
		}
		return pickedNumbers;
	}

	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
}

public class ex2 {
	public static void main(String[] args) {
		// 객체 생성
		LottoMachine machine = new LottoMachine();
		
		// 로또 번호 가져오기
		int[] numbers = machine.getLottoNumbers();
		
		// 결과 출력
		System.out.print("생성 번호 : ");
		for (int i : numbers) {
			System.out.printf("%d, ", i);
		}
	}
}
