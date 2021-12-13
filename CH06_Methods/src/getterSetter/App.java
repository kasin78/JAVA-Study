package getterSetter;

public class App {
	public static void main(String[] args) {
		// 인스턴스 변수에 접근하는 메소드 get 과 set
		Person p1 = new Person();
		// 보안상 객체의 변수에 바로 접근하지 못함
        // p1.name = "펭수";
		p1.setName("펭수");
		System.out.println(p1.getName());
		
		p1.setAge(30); // 값을 입력
		System.out.println(p1.getAge()); // 값을 리턴
		
		Person p2 = new Person();
		
		p2.setName("라이언");
		System.out.println(p2.getName());
		p2.setAge(10); 
		System.out.println(p2.getAge()); 
	}
}
