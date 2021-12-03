package game.objects;

public enum GameObject { // 이전의 가위바위보 객체 대신에 가위바위보라는 상수들을 생성
	// name : enum의 상수값, id = enum의 ordinal로 대체
	가위, 바위, 보;
	
	private int[][] comparison = {
			//              가위 바위  보
			/* 가위(0) */	{0,   -1,   1},
			/* 바위(1) */	{1,    0,  -1},
			/*   보(2) */	{-1,   1,   0}
	};
	
	// 상대의 (가위, 바위, 보)와 비교해서 결과 리턴
	public int compare(GameObject ob) {
		return comparison[this.ordinal()][ob.ordinal()]; // enum 끼리 비교해서 인덱스 번호로 비교
	}
	
}
