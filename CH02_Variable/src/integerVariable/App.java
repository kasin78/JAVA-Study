package integerVariable;

public class App {
	public static void main(String[] args) {
		// 변수 만들기 : 1. 변수선언(타입, 자료형), 2. 변수 초기화
		int x = 10;
		int y = 30;

		int z = x + y; // z 초기값 10 + 30 = 40

		int a; // a를 선언(초기 선언에는 무조건 타입 필요)
		int b = 10; // 변수 b는 선언과 초기화 동시에
		a = 7; // a에 초기값 입력

		System.out.println("변수 z의 값 : " + z); // 문자열("") + 정수 = 전부 문자열
		System.out.println("변수 a의 값 : " + a);
		System.out.println("변수 b의 값 : " + b);
		
		// 변수는 값을 다시 재할당 가능(바꿀 수 있다)
		z = a + b;
		System.out.println("변수 z의 값 : " + z);
	}
	// int 정수
	// double 실수
	// char 문자(1개)
	// boolean 논리형(true, false)
}
