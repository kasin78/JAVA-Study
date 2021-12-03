package static_InnerClass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();
		
		// 외부로 내부 클래스를 불러올 떄
		// 1. 내부 클래스 (외부클래스의 객체(p1)가 필요함)
		Person.Head head = p1.new Head();
		head.print();
		// Person 안의 클래스 Head
		
		// 2. 스태틱 내부 클래스 (외부클래스 이름으로 객체생성)
		Person.Body body = new Person.Body();
		body.print();
		
		
		
	}

}
