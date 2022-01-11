package integerVariable;

public class VariableAssignment {
	public static void main(String[] args) {
		
		int dogs = 8;
		int cats = 3;
		
		System.out.println("변경전 dog : " + dogs);
		System.out.println("변경전 cat : " + cats);
		
		dogs = cats; // dog = 3;
		cats = 10; 
		
		System.out.println("변경후 dog : " + dogs);
		System.out.println("변경후 cat : " + cats);
	}
}
