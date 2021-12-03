package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat(); // Cat으로 업캐스팅(객체는 HouseCat이지만 Cat의 메소드만 사용가능하게됨)
		cat1.vocal();
		cat1.hunt();
		// cat1.call(); // cat1은 Cat 클래스이기 때문에 Cat 클래스에 없는 메소드 사용불가, 오버라이딩 됨
		
		HouseCat cat2 = (HouseCat)cat1; // Cat으로 업캐스팅된 cat1을 HouseCat으로 다운캐스팅
		cat2.call(); // 다운캐스팅을 통해 HouseCat의 call 메소드를 사용가능
		
	}

}
