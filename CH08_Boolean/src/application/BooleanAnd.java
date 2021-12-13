package application;

public class BooleanAnd {
	public static void main(String[] args) {
		// A && B => A, B 모두 참일때만 참
		boolean isRaining = true; // 비가 오는가?
		boolean haveUmbrella = false; // 우산을 가지고 있나?
		boolean takeUmbrella = false; // 우산을 쓰나?
		
		// 1
		if (isRaining) {
			if (haveUmbrella) {
				takeUmbrella = true;
			}
		}
		System.out.println("1번째 : " + takeUmbrella);
		
		// 2
		if (isRaining && haveUmbrella) {
			takeUmbrella = true;
		}
		System.out.println("2번째 : " + takeUmbrella);
		
		// 3
		takeUmbrella = isRaining && haveUmbrella ? true : false;
		System.out.println("3번째 : " + takeUmbrella);
	}
}
