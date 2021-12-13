package application;

public class StringEquals {
	public static void main(String[] args) {
		// 두개의 문자열이 같은지 비교
		String t1 = "apple";
	 // String t2 = "orange";
	    String t2 = "Apple";

		System.out.printf("두개의 문자열 일치 : %b \n", t1 == t2);
		System.out.printf("두개의 문자열 일치 : %b \n", t1.equals(t2));
		// 문자열이 정확히 같으면(대소문자 포함) true 아니면 false
		
		System.out.printf("두개의 문자열 일치 : %b \n", t1.equalsIgnoreCase(t2));
		// 문자열이 같으면(대소문자 무시) true 아니면 false
	}
}
