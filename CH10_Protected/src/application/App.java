package application;

// import entities.*; // 패키지 entities에 있는 모든 클래스
import entities.Apple;
import entities.Banana;
import entities.Fruit;


public class App {
	public static void main(String[] args) {
		// protected 접근 지정자 사용시 다른 패키지에서는 사용할 수 없고 상속받은 자식 클래스에서만 사용 가능
		
		Fruit f1 = new Apple();
		// f1.id=7;
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());

	}

}
