package lambda_parameter;

interface Runner {
	void execute(String text); // 추상 메소드에 매개변수 1개가 있는 경우
}

public class App {
	public static void main(String[] args) {
		// 매개변수가 있는 경우
		Runner run1 = (t) -> System.out.println(t); // t = text
		run1.execute("펭수");
		
		Runner run2 = s -> System.out.println(s); // 매개변수가 1개일 때는 () 생략 가능
		run2.execute("길동");                     // 매개변수가 없을 때는 () 무조건 있어야함 
	}
}
