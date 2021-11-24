package school;

public class Student {
	// 변수 생성
	private String name;
	private int age;
	private boolean isVisible; // 집체 true, 원격 false
	private double temperature;
	
	// 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		isVisible = true;
		temperature = 0;
	}
	
	// toString
	public String toString() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 집체=" + isVisible + ", 온도=" + temperature + "]";
	}

	// get set
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVisible() {
		return isVisible;
	}
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
