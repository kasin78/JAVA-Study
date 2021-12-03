package getterSetter;

public class Person {
	// private가 붙으면 같은 클래스에서만 사용 가능
		// get set 메소드를 통해 데이터를 호출해야함
	private String name;
	private int age;
	
	// public은 다른 클래스에서 쓸 수 있음
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		this.name = name; // this => 참조 변수를 의미(p1, p2)
	}
	// get은 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	
	// set get age 만들기
	public void setAge(int age) {
		this.age = age;
		System.out.println(this);
	}
	public int getAge() {
		System.out.println(this);
		return age;
	}
}
