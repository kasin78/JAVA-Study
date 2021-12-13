package method;

public class Person {
	String name; // 초기값 안 넣었어도 기본값 null
	int age;     // 초기값 안 넣었어도 기본값 0
	
	// 클래스 안에 만든 함수를 메소드 => 객체 생성시 사용 가능
	public void sayHello() {
		System.out.println("헬로우! " + name);
	}
	// void : 리턴할 값이 없는 함수, 단순 호출용
}
