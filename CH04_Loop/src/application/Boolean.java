package application;

public class Boolean {

	public static void main(String[] args) {
		// boolean 타입은 true(참), false(거짓)
		boolean c1 = false;
		System.out.println("조건 1 : " + c1);
		
		// 비교 결과가 참, 거짓
		boolean c2 = 4 < 5;
		System.out.println("조건 2 : " + c2);
		
		boolean c3 = 4 > 5;
		System.out.println("조건 3 : " + c3);
		
		// == :같다 = 참, 같지 않다 = 거짓
		boolean c4 = 4 == 5;
		System.out.println("조건 4 : " + c4);
		
		// != : 같다 = 거짓, 같지 않다 = 참
		boolean c5 = 4 != 5;
		System.out.println("조건 5 : " + c5);
		System.out.printf("조건 5 : %b", c5); // boolean은 %b로 printf에 사용
	}

}
