package school.복습;

public class Student {
	// 변수 생성
	private String name;
	private int age;
	private boolean isVisible; // 집체 true, 원격 false
	private double temperature;
	
	// 생성자
	public Student(String name, int age, boolean isVisible, double temperature) {
		this.name=name;
		this.age=age;
		this.isVisible=isVisible;
		this.temperature=temperature;
	}
	
	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isVisible=" + isVisible + ", temperature=" + temperature
				+ "]";
	}
	
	// get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	

	
}
