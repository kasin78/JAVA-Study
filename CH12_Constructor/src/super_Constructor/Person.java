package super_Constructor;

public class Person { // 부모
	private String name;
	
	public Person(String name) { // Person 생성자(부모 생성자)
		System.out.println("Person 생성자");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
}
