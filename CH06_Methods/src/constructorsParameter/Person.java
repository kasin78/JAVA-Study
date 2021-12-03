package constructorsParameter;

public class Person {
	private String name;
	private double height;
	
	// 생성자 메소드 : public + 클래스명(), 리턴 타입 없음
	public Person() {
		name = "익명";
		height = 170;
		System.out.println("한 사람을 생성!");
	}
	// 매개변수 입력 없으면 위의 데이터가 기본값으로 입력
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	// 매개변수 있을 시 매개변수 데이터 입력
	
	// get set method
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return name;
	}
	
	// toString 메소드
		public String toString() {
			return "이름 : " + name + ", 키 : " + height;
		}
	
	public void setHeight (double height) {
		this.height = height;
	}
	public double getHeight () {
		return height;
	}
}
