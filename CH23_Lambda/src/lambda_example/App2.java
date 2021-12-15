package lambda_example;

interface Runner {
	void execute(); // 추상 메소드 1개 => 람다식 사용가능
					// 람다식은 구현하는 인터페이스에 추상메소드가 딱 1개 있을 때만 사용가능
}

public class App2 {
	public static void main(String[] args) {
	   /* Runner run = () -> { // 추상 메소드 구현
		System.out.println("헬로우");
		System.out.println("람다식");
		}; */
		
		// 람다식으로 추상메소드 execute를 구현
		Runner run = () -> System.out.println("헬로우"); // 실행 코드가 한 줄 일때는 코드블록 {} 생략가능
	
		run.execute();
		
		System.out.println(run instanceof Runner); // run은 Runner의 객체? true
		System.out.println(run.getClass());        // 클래스는 람다식
	}
}
