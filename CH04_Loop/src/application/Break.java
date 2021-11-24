package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 break; 사용시 빠져나옴
		int count = 0;
		
		while(true) { // 무한반복
			System.out.println("헬로우!" + count);
			
			if (count ==5) {
				break; // count가 5가 되면 while문 깨뜨림
			}
			
			System.out.println("How are U?");
			
			count++;
		}
		
		System.out.println("종료");
	}

}
