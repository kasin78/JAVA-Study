package application;

public class MultiArray_Q {

	public static void main(String[] args) {
		int[][] values = {
				{1, 5, 7}, 
				{9, 6, 3}, 
				{2, 4, 6}
		};
		
		int total = 0;
		
		for (int i = 0; i < values.length; i++) {		
			for (int j = 0; j < values[i].length; j++) {
				total += values[i][j];
			}		
		}
		
		System.out.println("총합 : " + total);

	}

}
