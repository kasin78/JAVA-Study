package local_InnerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name; // 인스턴스 변수
	
	public App() {
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
		// System.out.println(name); // 객체를 생성해야 사용 가능
		App app = new App();
		// app.name = "펭수";
		app.run();
		
	}
	
	private void run() {
		// 클래스(App) 안의 메소드(run)에 클래스(Printer)
		class Printer implements Runnable {
//			public void print() {
//				System.out.println(name); // 내부 클래스는 상위 클래스(App)의 변수(name)를 사용 가능
//			}
			@Override
			public void run() {
				System.out.println(name);
			}
		}
		
//		new Printer().print();	
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
}
