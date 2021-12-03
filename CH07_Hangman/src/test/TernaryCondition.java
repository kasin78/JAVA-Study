package test;

public class TernaryCondition { // 삼항 조건 연산자
	
	public static void main(String[] args) {
		// 함수 = 조건 ? A : B (조건이 참이면 A 아니면 B)
		// if else문을 한 줄로 줄인 형태라고 생각
		System.out.println(true ? "참" : "아님" );
		System.out.println(false ? "참" : "아님" );
		
		int n = 101;
		n = n > 100 ? 100 : n; // 100보다 크면 100 출력 아니면 n
		System.out.println(n);
		
		int[] values = {6, 3, 92, 64, 17};
		int max = 0; // 최대값
		
		for (int val : values) {
//			if (val > max) {
//				max = val; // max값보다 val가 크면 val값을 max에 넣는다
//			}
			max = val > max ? val : max;
		}
		System.out.println(max);
	}
}
