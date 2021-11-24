package returnValue;

public class App {

	public static void main(String[] args) {
		// 리턴 값이 있는 메소드 사용
		ReturnMethod r1 = new ReturnMethod();
		
		String cat = r1.getAnimal();
		// 호출되면 리턴 값이 String타입 cat에 저장됨
		
		System.out.println("캣 변수 : " + cat);
		// cat에 저장된 리턴값 "고양이" 출력
		
		
	}
}
