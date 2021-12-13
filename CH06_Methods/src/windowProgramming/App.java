package windowProgramming;

public class App {

	public static void main(String[] args) {
		// 윈도우 객체를 생성
		// set 메소드로 값을 입력하고 get 메소드로 값을 출력
		// 설정 윈도우창의 가로길이 300 세로길이 600
		// 현재 보이도록 true, top 200, left 400
		
		Window window = new Window();
		
		window.setWidth(300);
		window.setHeight(600);
		window.setIsVisible(true);
		window.setTop(200);
		window.setLeft(400);
		
		System.out.println("가로 길이 : " + window.getWidth());
		System.out.println("세로 길이 : " + window.getHeight());
		System.out.println("가시 유무 : " + window.getIsVisible());
		System.out.println("위치 top : " + window.getTop());
		System.out.println("위치 left : " + window.getLeft());
	}
}
