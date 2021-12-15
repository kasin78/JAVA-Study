package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static void greet() {
		System.out.println("헬로우!");
	}

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		// 람다식
		//service.scheduleAtFixedRate(() -> System.out.println("헬로우!"), 0, 1000, TimeUnit.MILLISECONDS);
		
		// 메소드 레퍼런스 
			// 메소드 레퍼런스는 스태틱 메소드를 만들어 사용
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
		                    // 클래스명::메소드명
	}
}
