package multiThread_Join;

public class App {
	
	private int value = 0;
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				value++; // value를 1씩 증가	
			}
		};
		
		Thread t1 = new Thread(runnable); // 새 스레드 t1 생성
		Thread t2 = new Thread(runnable); // 새 스레드 t2 생성
		
		t1.start(); // t1 실행
		t2.start(); // t2 실행
		
		System.out.println("Value : " + value); // 메인 쓰레드 실행
		
		t1.join(); // 메인 쓰레드가 t1을 실행할 때까지 대기
		t2.join(); // 메인 쓰레드가 t2을 실행할 때까지 대기
		
		System.out.println("Value : " + value); // 메인 쓰레드가 t1, t2가 끝난 다음에 출력
	}
	
	public static void main(String[] args) throws InterruptedException {
		new App().run(); // 앱 객체를 만들고 run() 메소드 실행	
	}
}
