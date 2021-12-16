package operators;

public class AND_OR {
	public static void main(String[] args) {
		// 비트 and or 연산
		int val1 = 0b01010011;
		int val2 = 0b11010110;
		
		// replace() 이해
		System.out.println(toBinary(1));
		
	System.out.println();
		// and 비트 연산
		int result1 = val1 & val2;
		
		System.out.println("AND 비트 연산");
		System.out.println(toBinary(val1));
		System.out.println(toBinary(val2));
		System.out.println(toBinary(result1));
		
	System.out.println();
		// or 비트 연산
		int result2 = val1 | val2; 
		
		System.out.println("OR 비트 연산");
		System.out.println(toBinary(val1));
		System.out.println(toBinary(val2));
		System.out.println(toBinary(result2));
	}
	
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 리턴한다
		// replace -> " "은 0으로 채워라
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
}
