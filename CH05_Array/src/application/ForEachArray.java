package application;

public class ForEachArray {
	public static void main(String[] args) {
		// 배열에 사용할 수 있는 반복문 for each
		// 간단한 배열의 반복에는 for each문을 사용하고 index 번호가 필요할 경우 for문을 사용
		String[] fruits = {"바나나", "사과", "수박"};
		int[] numbers = {1, 2, 3};
		boolean[] booleans = {true, false, true};
		double[] doubles = {1.1, 2.2, 3.3, 4.4};
		
		for (String x : fruits) { // for each 문은 (변수 : 배열)
								  // x에 fruits {} 안의 값들이 반복됨
			System.out.print(x + " ");
		}
		
		System.out.println("\n");
		
		for (int y : numbers) { 
			System.out.print(y + " ");
		}
		
		System.out.println("\n");
		
		for (boolean z : booleans) { 
			System.out.print(z + " ");
		}
		
		System.out.println("\n");
		
		for (double w : doubles) { 
			System.out.print(w + " ");
		}
	}
}
