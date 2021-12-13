package application;

public class Conditions {
	public static void main(String[] args) {
		// 조건문
		    //while(조건) {
			//    명령문
			// }
			// 조건에 도달할때까지 명령문 반복 수행
		int counter = 0;
		
//		while(true) {
//			System.out.printf("카운터 : %d \n", counter);
//			counter += 1;
//	     // counter = counter + 1;
//		}
		// 조건이 true이므로 카운터 1씩 더해서 무한 출력
		
		// 예제) 카운트가 10이 되면 종료되도록 프로그램
		while (counter <= 10) {
			System.out.printf("카운터 : %d \n", counter);
			counter += 1;
		}
		// counter에 1씩 더하다가 counter가 11이 되는 순간 false가 출력 종료
	}
}
