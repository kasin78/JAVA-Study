package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App {
	public static void main(String[] args) {
		Wrapper<Cat> wrap1 = new Wrapper<>();
		Wrapper<Creature> wrap2 = new Wrapper<>();
		Wrapper<Mammal> wrap3 = new Wrapper<>();
		
		// Cat cat = new Cat("마틸다");
		// Creature cr = new Creature("괴물");
		// Mammal m = new Mammal("포유류");
		
		wrap1.set(new Cat("마틸다"));
		wrap2.set(new Creature("괴물"));
		wrap3.set(new Mammal("포유류"));
		
		// 원래는 마틸다가 Object 타입으로 리턴되기 때문에 형변환 필요(Cat)하나
		// 제네릭 타입 클래스로 변경했으므로 그냥 출력해도 됨
		Cat c1 = wrap1.get();
		System.out.println(c1);
		Creature c2 = wrap2.get();
		System.out.println(c2);
		Mammal c3 = wrap3.get();
		System.out.println(c3);
		
		

	}

}
