package ConvertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨 온도를 화씨 온도로 변환
		double C = 25; // 섭씨 변수 C 초기값을 25로 설정
		double F = (C * 9/5) + 32; // 화씨 변수 F는 공식대로 설정
		
		System.out.println(F + "F");
		System.out.println("섭씨 " + C + "도는 화씨 " + F + "도이다");
	}
}
