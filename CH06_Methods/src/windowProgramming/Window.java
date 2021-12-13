package windowProgramming;

public class Window {
	private int width; // 가로
	private int height; // 세로
	private boolean isVisible;
	private int top; // 위치
	private int left; // 위치
	
	// get set 메소드 만들기
		// set일때는 매개변수를 정확히
		// get일때는 리턴 타입을 정확히
	// 가로
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	// 세로
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	// 보이는가 안 보이는가
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	// 위로부터의 위치
	public void setTop(int top) {
		this.top = top;
	}
	public int getTop() {
		return top;
	}
	// 왼쪽으로부터의 위치
	public void setLeft(int left) {
		this.left = left;
	}
	public int getLeft() {
		return left;
	}
}