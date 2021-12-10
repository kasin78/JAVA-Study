package Method;

public class ex8 {

	public static void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}

	private static Object guide(int a) {
		String floor = (a >=10)? "고층" : "저층";
		return floor;
	}
}
