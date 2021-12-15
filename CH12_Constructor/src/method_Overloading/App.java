package method_Overloading;

public class App {

	public static void main(String[] args) {
		// 메소드 오버로딩 (메소드는 이름과 매개변수가 전부 같아야 같은 메소드)
		Person person = new Person();
		
		person.greet();
		person.greet("펭수");
		person.greet(186);
		person.greet("라이언", 130);
	}
}
