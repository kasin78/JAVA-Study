package application;

import java.util.Scanner;

public class dummy {

	public static void main(String[] args) {
		Scanner stopGo = new Scanner(System.in);
		String Lucky = stopGo.next().toLowerCase();
		System.out.printf("탐험을 계속하시겠습니까? y/n " + "%s", Lucky);
		

	}

}
