package Method;

public class Example_2 {

	public static void main(String[] args) {
		// 칼로리 계산
		double perStep = 0.02;
		double footStep = 5000;
		double waste = perStep * footStep;	
		
		System.out.printf("소모 칼로리 : %.1f kcal \n", waste) ;

		// 칼로리 계산 2
		double onePork = 180;
		double porkKcal = 5.179;
		double people = 3;
		
		double totalPork = onePork * people;
		double totalKcal = totalPork * porkKcal;
		
		System.out.printf("삼겹살 %.0f인분 : %.2f kcal", people, totalKcal);
		
	}

}
