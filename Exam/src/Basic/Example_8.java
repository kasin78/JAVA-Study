package Basic;

public class Example_8 {

	public static void main(String[] args) {
		int totalSec = 7582;
		int sec = totalSec % 60; // 실제 초
		
		int totalMin = totalSec / 60;
		int min = totalMin % 60; // 실제 분
		
		int hour = totalMin / 60; // 실제 시간
		
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
	}

}
