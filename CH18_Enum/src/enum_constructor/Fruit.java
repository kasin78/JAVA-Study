package enum_constructor;

public enum Fruit { /* keyword가 enum(열거) : 어떤 클래스가 상수로만 구성되어 있으면 
					                          굳이 class로 선언할 필요 없음 */
	APPLE("초록색", 0), BANANA("노란색", 1), ORANGE("주황색", 2); // 상수들의 집합 (0, 1, 2 인덱스 번호)
	
	private String color;
	private int number;
	
	Fruit(String color, int number) { // enum의 생성자, public 없음
		this.color = color;
		this.number = number;
	}
	
	public String toString() {
		return super.toString().toLowerCase()+" ("+color+" "+number+")";
		// super : enum의 toString 실행
		// toLowerCase() : 소문자 출력
	}
}
