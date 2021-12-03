package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask { // TimerTask는 추상 클래스
	@Override
	public void run() { // Task는 추상 클래스 TimerTask를 상속 받았기에 여기서 추상 메소드를 구현해줘야함
		System.out.println("헬로우"); 
	}
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000); // 1000ms = 1초
		//                반복 실행할 메소드, 시작 시점, 반복 주기
		// Time 유틸 실행, TimerTask 추상 클래스에 반복 실행할 메소드 구현하고 넣기
	
	}

}

