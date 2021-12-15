package multiThread_Sync;

public class App {
	
	private int value = 0;
	
	private synchronized void increment() { // 이 메소드는 한번에 하나의 쓰레드만 접근하도록함
		value++;
	}
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment(); 
			}
		};
		
		Thread t1 = new Thread(runnable); 
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable); 
		
		t1.start(); 
		t2.start(); 
		t3.start(); 
				
		t1.join(); 
		t2.join(); 
		t3.join(); 
		
		System.out.println("Value : " + value); 
	}
	
	public static void main(String[] args) throws InterruptedException {
		new App().run();
	}
}
