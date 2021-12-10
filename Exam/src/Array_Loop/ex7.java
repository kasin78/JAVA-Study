package Array_Loop;

public class ex7 {

	public static void main(String[] args) {
		// 배열 생성
		int[] bacteriaCount = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
		
		// 개체 수 기록
		writeLog(bacteriaCount);
		
		// 결과 출력
		printLog(bacteriaCount);
	}

	private static void writeLog(int[] logs) {
		for (int i = 0; i < logs.length; i++) {
			System.out.printf("%d일차 : %d마리\n", i+1, logs[i]);
		}
	}
	
	private static void printLog(int[] logs) {
		System.out.printf("[");
		for (int i = 0; i < logs.length; i++) {
			System.out.printf("%d", logs[i]);
			if (i != logs.length - 1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("]");		
	}
}
