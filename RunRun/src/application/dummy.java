package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class dummy {

	public static void main(String[] args) {
		List<Integer> treasureCards = new ArrayList<>(Arrays.asList(1, 7, 13, 15, 2, 9, 11, 14, 4, 5, 3, 5, 17, 7, 11));
		Collections.sort(treasureCards);
		treasureCards.forEach(s -> System.out.print(s + ", "));
	}
}
