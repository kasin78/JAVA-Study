package InstanceVariable;

public class App {

	public static void main(String[] args) {
		// 같은 패키지 안에 있는 Person 클래스를 사용한다
		// 스캐너를 사용할려면 스캐너 클래스를 import 해야됨
			// 같은 패키지 안에 있는 클래스는 바로 사용 가능
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		
		Person p2 = new Person();
		p2.name = "펭수";
		p2.age = 17;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
