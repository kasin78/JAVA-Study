package throwing_exception2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		Scanner heatscan = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요 ");
		int heat = heatscan.nextInt();
		heatscan.close();
		
		try {
			stat.setTemperature(heat);
		} catch (Exception e) {
			// 온도 예외 발생
			// e.printStackTrace();
			System.out.println(e.getMessage()); // exception 문자열을 들고옴
		}
		

	}

}
