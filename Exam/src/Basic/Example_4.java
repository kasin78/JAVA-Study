package Basic;

import java.util.Scanner;

public class Example_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int basic_income = 8000;
		System.out.print("일한 시간은? ");
		int working_hour = scanner.nextInt();
		scanner.close();
		
		int wage = basic_income * working_hour;
		System.out.println(wage);
				
	}

}
