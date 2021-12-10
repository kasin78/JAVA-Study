package Java_Api;

import java.util.StringTokenizer;

public class ex3 {

	public static void main(String[] args) {
		// 입력 문자열
		String str = "치킨, 피자, 보쌈, 족발, 초밥, 떡볶이, 탕수육";
		String delim = ", ";
		
		// 1. 구분자를 ","로 하는 StringTokenizer를 생성하세요
		StringTokenizer st = new StringTokenizer(str, delim);
		
		// 2. 모든 토큰을 출력하세요
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
