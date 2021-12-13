package polymorphism;

public class App {

	public static void main(String[] args) {
		// 다형성 : 상속받은 자식 클래스는 부모 클래스로 선언 가능
//		Cat cat1 = new HouseCat();
//		Cat cat2 = new RoadCat();
//		Cat cat3 = new Tiger();
//		
//		Cat[] cats = {cat1, cat2, cat3};
//		
//		for (Cat c : cats) { // cats 배열의 각각의 객체가 c에 대입하여 반복
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats = {new HouseCat(), new RoadCat(), new Tiger()};
		// Cats[0] == new HouseCat()
		// Cats[1] == new RoadCat()
		// Cats[2] == new Tiger()
		
		// String[] s = {new String("문자열1"), new String("문자열2"), new String("문자열3")};
		
		// for 반복문
		for (int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		System.out.println("=================");
		
		// for each 반복문
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		System.out.println("=================");
		
		// 캐스팅 형변환 (기본 데이터 타입)
		int a = (int)1.2345;
		System.out.println(a);
		
		// 참조형 타입	(상속 관계일때)	
		Cat cat1 = new HouseCat(); // 업캐스팅
		HouseCat cat2 = (HouseCat)cat1; // 다운캐스팅
	}
}
