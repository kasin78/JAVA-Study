package constructorsParameter;

public class App {
	public static void main(String[] args) {
	
		Person p1 = new Person("펭수", 120.0);
		Person p2 = new Person("길동", 172.5);
		Person p3 = new Person();
		
		//System.out.printf("이름 : %s , 키 : %.1f \n", p1.getName(), p1.getHeight());
		//System.out.printf("이름 : %s , 키 : %.1f \n", p2.getName(), p2.getHeight());
		//System.out.printf("이름 : %s , 키 : %.1f \n", p3.getName(), p3.getHeight());
		
		System.out.println(p1);
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
