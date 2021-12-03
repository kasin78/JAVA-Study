package runtime_exception;

public class App {
	// RuntimeExcaption은 throws exception 제거해도 문법 에러가 나지않음
	public static void main(String[] args) {
		Thermostat stat = new Thermostat();
		
		stat.setTemperature(36);
		

	}

}
