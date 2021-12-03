package school.복습;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생 객체 만들기
		Student student = new Student("펭수", 17, false, 10.7);
		System.out.println(student);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.isVisible());
		System.out.println(student.getTemperature());
		
	}

}
