package example;

@FunctionalInterface
interface Greeter {
	void greet();
}

public class App2 {
	
	public static void main(String[] args) {
		// 람다식
		Greeter g = () -> System.out.println("헬로우!");
		g.greet();
		
		// 메소드 레퍼런스
		Greeter g2 = App2::sayHello;
		g2.greet();
	}
	
	// 메소드 레퍼런스 위해 스태틱 메소드 생성
	private static void sayHello() {
		System.out.println("헬로우!");
	}
}
