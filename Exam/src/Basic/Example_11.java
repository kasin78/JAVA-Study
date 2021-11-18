package Basic;

public class Example_11 {

	public static void main(String[] args) {
		double weight = 81.36;
		weight += 0.71;
		System.out.println(weight);
		weight -= 0.43;
		System.out.println(weight);
		
		double avgWeight = (weight + 82.07 + 81.64) / 3;
		
		System.out.printf("%.2fkg", avgWeight);

	}

}
