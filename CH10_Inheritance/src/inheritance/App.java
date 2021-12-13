package inheritance;

public class App {

	public static void main(String[] args) {
		// 동물 클래스는 메소드 eat()
		Animal ani = new Animal();
		ani.eat();
		// ani.fly(); 부모 클래스는 자식 클래스의 메소드 사용 불가능
		
		// 새 클래스는 메소드 fly()
		Bird bird = new Bird();
		bird.eat(); // 상속받은 메소드, 원래 Animal 클래스 메소드인데 상속받았기에 Bird 클래스도 사용가능
		bird.fly();
	}
}
