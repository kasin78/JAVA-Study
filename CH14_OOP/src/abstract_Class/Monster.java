package abstract_Class;
//추상 클래스를 상속받았을 경우 추상 메소드를 구현(만들어야)해야됨 

public class Monster extends GameObject {

	@Override
	public void describe() {
		System.out.println("몬스터 입니다");
		
	}
}
