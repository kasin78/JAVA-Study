package Method;

import java.util.Random;

public class Example_4 {

	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);
		
	}
	
	Random random = new Random();
	
	public static int dice() {
		return Math.random() * (6-1)+1;
	}
	
	public static double exchange(double dollar) {
		return dollar * 1082.25108;
	}

}
