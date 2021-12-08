package application;

import collections.Pair;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App2 {
	public static void main(String[] args) {
		
		Pair<Integer, Cat> pair = new Pair<>(1, new Cat("마틸다"));
		
		pair.getOne();
		pair.getTwo();
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
		
		System.out.println(pair);
		
	System.out.println("==================");
	
		Pair<Creature, Mammal> pair2 = new Pair<>(new Creature("괴물"), new Mammal("고래"));
		
		pair2.getOne();
		pair2.getTwo();
		
		System.out.println(pair2.getOne());
		System.out.println(pair2.getTwo());
		
		System.out.println(pair2);

	}

}
