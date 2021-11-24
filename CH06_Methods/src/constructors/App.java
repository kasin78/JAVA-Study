package constructors;

public class App {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		Person p1 = new Person();
		// 기본 생성자는 생략가능
		p1.setName("펭수");
		p1.setHeight(120.0);
		
		Person p2 = new Person();
		p2.setName("길동");
		p2.setHeight(172.5);
		
		Person p3 = new Person();
		// 생성자에 초기값으로 객체 생성
		
		System.out.printf("이름 : %s , 키 : %.1f \n", p1.getName(), p1.getHeight());
		System.out.printf("이름 : %s , 키 : %.1f \n", p2.getName(), p2.getHeight());
		System.out.printf("이름 : %s , 키 : %.1f \n", p3.getName(), p3.getHeight());
		
		
	}

}
