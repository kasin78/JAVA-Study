package operators;

public class SHIFT {
	public static void main(String[] args) {
		// SHIFT 연산
		int value = 0b00010001;
		System.out.println(toBinary(value));
		
		int result1 = value << 3; // 비트(0, 1) 왼쪽으로 3칸 이동
		System.out.println(toBinary(result1));
		
		int result2 = result1 >> 3; // 비트(0, 1) 오른쪽으로 3칸 이동
		System.out.println(toBinary(result2));
		
		System.out.println(100 << 3); // 100을 2진수로 바꾼 다음 비트 전체를 왼쪽으로 이동, 다시 10진수로 전환
									  // 곱하기, 2^n승, 즉 2*2*2
		System.out.println(100 >> 2); // 100을 2진수로 바꾼 다음 비트 전체를 오른쪽으로 이동, 다시 10진수로 전환
									  // 나누기, 2*2
	}
	
	public static String toBinary(int value) { 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
}
