package operators;

public class XOR_NOT {
	public static void main(String[] args) {
		// 비트 XOR, NOT 연산
		int val1 = 0b01010011;
		int val2 = 0b11010110;
		
		// XOR 연산 => 같으면 0, 다르면 1
		int result1 = val1 ^ val2; 
		
		System.out.println("XOR 연산");
		System.out.println(toBinary(val1));
		System.out.println(toBinary(val2));
		System.out.println(toBinary(result1));
		
	System.out.println();
		// NOT(~) 연산 => 0 -> 1, 1 -> 0
		System.out.println("NOT(~) 연산");
		System.out.println(toBinary(~result1));
	}
	
	public static String toBinary(int value) { 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
}
