package custom_exception;

import java.util.Scanner;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class App {
	
	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		Scanner heatscan = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요 ");
		int heat = heatscan.nextInt();
		heatscan.close();
		
		try {
			stat.setTemperature(heat);
		} catch (TempTooHighException e) { // 온도가 높을 때 실행(heat > 35)
			// 온도 예외 발생
			System.out.println(e.getMessage()); 
		} catch (TempTooLowException e) { // 온도가 낮을 때 실행(heat < 0)
			System.out.println(e.getMessage());
		}
	}
}
