package getterSetter;

public class Person {
	// private는 같은 클래스에서만 사용 가능
	private String name;
	private int age;
	
	// public은 다른 클래스에서 쓸 수 있음
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		this.name = name; // this => p1을 의미
	}
	// get은 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	
	// set get age 만들기
	public void setAge(int age) {
		this.age = age; // this => p2를 의미
		System.out.println(this);
	}
	public int getAge() {
		System.out.println(this);
		return age;
	}
}
