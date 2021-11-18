package Basic;

public class Example_13 {

	public static void main(String[] args) {
		double initialPosition = 1000;
		double initialVelocity = 0;
		double time = 5;
		double gravity = -9.81;
		
		double finalPosition = (0.5 * gravity * (time * time)) + (initialVelocity * time) + initialPosition;
		System.out.printf("5초 후 위치 : %.2fm", finalPosition);
	}

}
