package Method;

import java.util.Random;

public class Example_4 {
	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);
	}
	
	public static int dice() {
		int num = 0;
		Random random = new Random();
		random.nextInt(7);
		return num; // 1~6 사이의 정수
	}
	
	public static double exchange(double dollar) {
		return dollar * 1082.25108;
	}

}
