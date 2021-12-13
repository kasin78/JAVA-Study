package overridingMethod;

public class HouseCat extends Cat {
	@Override // 오버라이드 어노테이션 : 메소드의 이름이 부모 클래스의 메소드와 같아야함 아니면 에러 발생
	public void vocal() { // 오버라이딩 메소드 : 자식 클래스에서 부모와 똑같은 메소드를 만듦(우선적 적용)
		System.out.println("미야우~");
	}
}
