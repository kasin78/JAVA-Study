package application;

public class Switch {
	public static void main(String[] args) {
		// Switch문
			// if~else if~else문으로 표현가능(이게 조건이 더 포괄적)
		int option = 6;
		
		switch(option) {
			case 0: // 옵션 변수가 케이스 0과 같을때
				System.out.println("옵션 0 선택");
				break; // 항상 케이스 하나 끝에 break 작성
					   // break가 없으면 밑의 항목까지 실행함
			case 1: // 옵션 변수 케이스가 1과 같을때
				System.out.println("옵션 1 선택");
				break;
			case 10: // 옵션 변수 케이스가 10과 같을때
				System.out.println("프로그램 종료");
				break;
			default: // else와 같음 위의 케이스들 모두와 맞는 것이 없을 때 실행
				System.out.println("잘못된 옵션번호");
				break;
		}
	}
}


