package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 implements Runnable {
	@Override
	public void run() { // Runnable의 추상 메소드를 구현(완성)한다
		// 코드 작성
		System.out.println("타이머 2 헬로우");
	}
}

class Task2 extends TimerTask { // TimerTask는 추상 클래스
	@Override
	public void run() { // Task는 추상 클래스 TimerTask를 상속 받았기에 여기서 추상 메소드를 구현해줘야함
		System.out.println("타이머 1 헬로우"); 
	}
}

public class App {

	public static void main(String[] args) {
		// 타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task2(), 0, 1000);
		
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task1(), 0, 1, TimeUnit.SECONDS); // 1초에 한번씩 반복
		
	}

}
