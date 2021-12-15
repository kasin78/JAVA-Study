package lambda_parameter2;

interface Runner {
	void execute(String name, String text); // 추상 메소드에 매개변수 2개 이상 있는 경우
}

public class App {
	public static void main(String[] args) {
		// 매개변수 여러개가 있는 경우
		Runner run1 = (n, t) -> System.out.printf("%s님 %s", n, t); // n = name, t = text
		run1.execute("펭수", "안녕하세요!");
	}
}
