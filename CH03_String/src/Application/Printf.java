package Application;

public class Printf {

	public static void main(String[] args) {
		// printf 출력
			// printf도 줄 띄움이 없음
		// %d : 정수 형식으로 출력
		// %s : 문자열 형식으로 출력
		// %c : 문자 형식으로 출력
		int age = 25;
		String addr = "부산진구";
		
		System.out.printf("내 나이는 %d살 입니다.\n", age); // age 값이 %d 자리에 정수형식으로 출력
		System.out.printf("내 나이는 %d살이고, %s에 살고 있습니다.\n", age, addr); 
						// age 값이 %d 자리에 정수 형식으로 addr 값이 %s에 문자열 형식으로 출력
		
		// %f : 소수점 형식으로 출력
		double pi = 3.14592;
		System.out.printf("파이의 값 : %f \n", pi);
		System.out.printf("파이의 값 : %.2f", pi); // 소수점 2자리까지

	}

}
