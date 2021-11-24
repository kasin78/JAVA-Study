package constructors;

public class Person {
	private String name;
	private double height;
	
	// 생성자 메소드 : public + 클래스명(), 리턴 타입 없음
	public Person() { // 기본 생성자(생략가능)
		name = "익명";
		height = 170;
		// Person 생성할 때 데이터가 입력됨(초기값, p3 참조)
		System.out.println("한 사람을 생성!");
	}
	
	// get set method
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	public double getHeight () {
		return height;
	}
}
