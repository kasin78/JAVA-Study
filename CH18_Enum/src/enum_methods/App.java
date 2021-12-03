package enum_methods;

public class App {
	public static void main(String[] args) {
	// enum에서 사용하는 메소드
		
	// values() :  enum의 모든 상수들을 배열로 리턴
		Fruit[] fruits = Fruit.values(); 
			for(Fruit f : fruits) {
				System.out.println(f);
			}
			
			// 조금 더 축약
				for(Fruit f : Fruit.values()) {
					System.out.println(f);
				}
				
System.out.println("================");
				
	// ordinal() : enum의 상수의 순서(인덱스 번호)
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
				
System.out.println("================");
				
	// valueOf("문자열") : 문자열과 같은 enum을 찾음
		// Fruit f1 = Fruit.valueOf("PEACH");
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		
	}
}
