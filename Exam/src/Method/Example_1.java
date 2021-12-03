package Method;

public class Example_1 {

	public static void main(String[] args) {
		System.out.println("Line 1");
		threeLines(); // 같은 클래스라서 그냥 적기만 해도 가능
		System.out.println("Line 2");

	}
	
	public static void threeLines() {
		oneline();
		oneline();
		oneline();
	}
	
	public static void oneline() {
		System.out.println(">");
	}

}
