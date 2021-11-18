package Basic;

public class Example_12 {

	public static void main(String[] args) {
		int num = 374;
		int hundredDigit = num / 100; // 100자리 수		
		
		int restDigit = 374 % 100;
		int tenDigit = restDigit / 10; // 10자리 수
		int oneDigit = restDigit % 10; // 1자리 수
		
		System.out.print("총합 : ");
		System.out.println(hundredDigit + tenDigit + oneDigit);
		
//		System.out.println("총합 : " + hundredDigit + tenDigit + oneDigit); // 총합 : 374

	}

}
