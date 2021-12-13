package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 
		// for (초기값; 조건; 증감) {
		//         명령문;
		// }
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}
		
//		for(;;) { // 무한 반복
//			System.out.println("헬로우!");
//		}
		
		System.out.print("==============");
		
		// 예제) for 반복문을 사용하여 1에서 100까지의 합을 출력하라
		int sum = 0; // i 반복해서 더하는 것을 모아줄 변수 sum
				
		for (int x = 1; x <= 100; x++) {
			sum += x;
		}
		System.out.println(sum);
	}
}
