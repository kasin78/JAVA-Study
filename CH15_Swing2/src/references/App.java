package references;

class Person {
	
}

public class App {

	public static void main(String[] args) {
		Person p1 = new Person(); // 참조 변수 p1은 Person 객체가 생성된 위치(address)를 가진다
		
		System.out.println(p1); // p1이 받은 주소가 나옴
		
		Person p2 = p1; // p1의 주소를 참조 변수 p2에 넘김
		
		System.out.println(p2); // p2의 주소가 나옴, 이는 p1과 같음
		
		test(p2); // p2의 주소가 나옴

	}

	private static void test(Person p) {
		System.out.println(p); // 매개변수로 입력된 p의 주소를 출력
		
	}

}
