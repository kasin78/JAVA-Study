package Method;

public class ex13 {
	public static void main(String[] args) {
		printPay(10.00, 40);
		System.out.println("==============");
		printPay(10.00, 50);
		System.out.println("==============");
		printPay(7.50, 38);
		System.out.println("==============");
		printPay(8.50, 66);
	}

	private static void printPay(double basePay, int hours) {
		double pay = 0.0;		
		
		if (true) {
			pay = basePay*hours;
			if (hours > 40 && hours <= 60) {
				pay = (1.5*basePay)*(hours-40)+(basePay*40);
			}
			else if (hours > 60) {
				pay = (1.5*basePay)*(hours-40)+(basePay*40);
				System.out.println("과로사 주의");
			}
			else if (basePay < 8.00) {
				System.out.println("돈 좀 주라");
			}
		}
		System.out.printf("$ %.2f\n", pay);	
	}
}
