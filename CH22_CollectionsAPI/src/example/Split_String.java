package example;

public class Split_String {
	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- even beyond the growing data about waning vaccine immunity.";
		String text2 = "중흥그룹이 9일 대우건설 인수 본계약을 체결하면서 재계 순위의 지각변동을 예고했다. 중흥그룹은 재계 서열 40위권에서 20위권으로 단숨에 도약한다. 건설업계에서는 ‘지방’, ‘중견’의 꼬리표를 떼고 ‘빅3 건설사’로 발돋움한다.";
		
		String[] words1 = text1.split("[^a-zA-Z]+"); // 영문 철자를 제외한 특수문자 스페이스, 점, 슬래시 같은 것들을 제외하고 단어만
													// 구글링 '레귤러 익스프레션(정규 표현식)' 참조
		String[] words2 = text2.split("[^가-힣]+"); 
		
		
		for (String w : words1) {
			if (w.length() < 3) {
				continue; // 철자가 3 이하면 그냥 넘어가겠다(passing)
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
		
		for (String w : words2) {
			if (w.length() < 3) {
				continue; // 철자가 3 이하면 그냥 넘어가겠다(passing)
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
	}
}
