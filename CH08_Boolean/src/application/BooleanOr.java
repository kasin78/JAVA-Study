package application;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘중에 하나라도 참이면 참, 둘다 거짓이면 거짓
		boolean isRaining = true; // 비가 오는가?
		boolean mightRain = false; // 비가 올 가능성이 있나?
		boolean takeUmbrella = false; // 우산을 쓰나?
		
		takeUmbrella = isRaining || mightRain;
		
		System.out.println(takeUmbrella);
	}

}
