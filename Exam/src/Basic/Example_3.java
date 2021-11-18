package Basic;

public class Example_3 {

	public static void main(String[] args) {
		double mon = 8.62;
		double tue = 10.23;
		double wed = 12.48;
		double thu = 7.82;
		double fri = 9.54;
		
		double total = mon + tue + wed + thu + fri;
		
		System.out.println("$" + total);
		System.out.printf("printf로 구한 총합 : %.2f", total);

	}

}
