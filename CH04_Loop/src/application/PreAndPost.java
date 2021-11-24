package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감 연산자 ++ -- 위치에 따라 다른 경우
		// 뒤에 있을 경우 먼저 사용하고 증감, 앞에 있을 경우 먼저 증감하고 사용
		int x = 5;
		System.out.println(x++); // 5 선출력 이후 +1하고 6을 리턴
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y); // 먼저 +1 하여 4를 출력
		
		int z = 10;
		
		int sum = x + z++;
		
		System.out.println(sum); // x=6(line9) z=10, 6 + 10 = 16 이후 z = 11 됨
		
		System.out.print("==============\n");
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits); // apples = 6 bananas = 4, 6 + 4 = 10 이후 bananas는 5 
	}

}
