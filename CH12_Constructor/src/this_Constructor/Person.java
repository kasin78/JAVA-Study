package this_Constructor;

public class Person {
	
	private String name; // 이름
	private int age;     // 나이
	
	public Person() { 
		// this() 생성자
		this("익명", 0);
	}
	
	public Person(String name) { 
		this(name, 0);
	}
	
	public Person(String name, int age) { 
		this.name = name;
		this.age = age;
	}

	@Override // source에서 toString 메소드 필드는 변수들을 의미 
	public String toString() {
		return "Person [이름 = " + name + ", 나이 = " + age + "]";
	}
	
	
	
	
}
