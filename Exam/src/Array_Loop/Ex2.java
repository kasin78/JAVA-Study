package Array_Loop;

public class Ex2 {

	public static void main(String[] args) {
		String[] cities = {"서울", "부산", "인천", "대전", "대구"};
		int[] visitors = {599, 51, 46, 43, 27};
		
		for (int i = 0; i < cities.length; i++) {
			for (int j = 0; j < visitors.length; j++) {
				if ( i == j ) {
					System.out.printf("%s : %d명 \n", cities[i], visitors[j]);
				}
				else {
					System.out.print("");
				}
			}
		}
	}
}
