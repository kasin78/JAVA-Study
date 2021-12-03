package default_Constructor;

public class Person {
	
	private String name; // 이름
	private int age;     // 나이
	
	public Person() { // 생성자는 클래스 이름과 같고 리턴 타입이 없음
		System.out.println("디폴트 생성자로 생성됨");
		name = "모름";
		age = 0;
	}
	
	public Person(String name) { 
		this.name = name;
		age = 0;
		System.out.println("이름만 알고 있음");
	}
	
	public Person(String name, int age) { 
		System.out.println("이름과 나이 모두를 알고 있음");
		this.name = name;
		this.age = age;
	}

	@Override // source에서 toString 메소드 필드는 변수들을 의미 
	public String toString() {
		return "Person [이름 = " + name + ", 나이 = " + age + "]";
	}
	
	
	
	
}
