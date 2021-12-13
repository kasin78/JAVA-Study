package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열
		String[][] texts = {
				{"하나", "둘", "셋"}, // 0번째 배열
				{"넷", "다섯", "여섯"}, // 1번째 배열
				{"일곱", "여덟", "아홉"} // 2번째 배열
		};
		
		// 각각의 배열을 출력
		for (int i = 0; i < texts.length; i++) { // 이중 배열의 length는 배열의 갯수, 현재 3개
//			System.out.printf("%d번째 배열 %s \n", i, texts[i]);
//			String[] innerArray = texts[i];

			// 각각의 배열 안에 있는 값을 출력
			for (int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s \t", texts[i][j]);
			}
			System.out.println();
		}
	}
}
