package Method;

public class Example_2 {

	public static void main(String[] args) {
		// 칼로리 소모량은?
		System.out.printf("소모 칼로리 : %s kcal \n", calculateCalory(5000));
		
		// 리뷰 : 칼로리 계산
		int people = 3;
		System.out.printf("삼겹살 %d인분 : %s kcal", people, totalKcal(people));	
	}
	
	// 칼로리 계산 메소드
	private static double calculateCalory (int walk) {
		return 0.02 * walk;
	}
	
	private static double totalKcal (int people) {
		return (5.179 * 180) * people;
	}
	
	
	
}
