package timer_Example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	@Override
	public void run() { // Runnable의 추상 메소드를 구현(완성)한다
		// 코드 작성
		System.out.println("Hello!");
	}
}

public class App {

	public static void main(String[] args) {
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); // 1초에 한번씩 반복
		
	}

}
