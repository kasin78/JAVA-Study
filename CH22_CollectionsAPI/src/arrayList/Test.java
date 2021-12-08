package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Double> numbers = new ArrayList<>();
		
		while (true) {
			System.out.print("숫자 또는 'q' 입력 > ");
			
			String input = scanner.nextLine();
			input = input.trim(); // 공백제거, 이거 없으면 스페이스로 띄어진 공간까지 같이 출력됨
			
			if (input.equalsIgnoreCase("q")) { // 입력을 q, Q로 하면 반복문 종료
				break; 
			}
			
			try {
				double value = Double.parseDouble(input); // 문자열 => 실수 변환
				numbers.add(value); // 실수로 변환된 값을 리스트에 입력
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다");
			}
		}
		scanner.close();
		
		System.out.println();
		
		if (numbers.size() > 0) {
			System.out.print("입력된 숫자 : ");
			for (Double num : numbers) {
				System.out.printf("%.2f\n", num);
			}
		}
		else {
			System.out.println("숫자가 입력되지 않음!");
		}
		
		// total 구하기
		double total = 0;
		for (int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i);
		}
		
		// 평균값
		double avg = total / numbers.size();
		System.out.printf("평균값 : %.2f ", avg);
			
	}	
}
