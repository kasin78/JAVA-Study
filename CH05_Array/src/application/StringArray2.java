package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조 변수(reference variable)은 주소값을 가진다
		String text = null; // null값은 주소값이 없다는 것
        // int x = null; 기본 자료형에는 null 값을 입력불가
		
		// text = new String("헬로우"); // 헬로우 문자열을 text에 넣는다
		text = "hello";
		
		System.out.println(text);
		
		String[] texts = null; // 실제 문자열 배열은 없음
		System.out.println(texts);
		
		texts = new String[3]; // 문자열 배열 3칸을 생성해서 texts에 주소 입력
		
		System.out.println(texts); // 배열 주소가 나옴
	
		System.out.println(texts[0]); // 문자열 배열 3칸이 있으나 칸 안에 데이터는 없음(null)
		
		texts[0] = new String("하이!"); // 배열 칸에 데이터 삽입
		texts[1] = "안녕?";
		texts[2] = "굿 바이";
		
		for (String w : texts) {
			System.out.print(w + " ");
		}
				

	}

}
