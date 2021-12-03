package overridingMethod;

public class App {

	public static void main(String[] args) {
		// 메소드 오버라이딩
			// 자식 클래스에서 부모 클래스와 똑같은 메소드를 만들면 자식 클래스의 메소드가 우선권을 가짐
		HouseCat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		RoadCat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
	}

}
