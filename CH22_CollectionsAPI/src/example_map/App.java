package example_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Person implements Comparable<Person> {
	// Person의 이름으로 equals 메소드를 만들어 key값의 중복을 이름으로 하도록한다
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override 
	public boolean equals(Object obj) { // 맵에서 키값(Person)으로 이름이 같으면 중복이 되게 수정
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		// 이름으로 비교
	}
}

public class App {
	public static void main(String[] args) {
		// HashMap
		HashMap<Person, Boolean> people1 = new HashMap<>();
		
		inputMap(people1);
		displayMap(people1);
		
		// LinkedHashMap
		LinkedHashMap<Person, Boolean> people2 = new LinkedHashMap<>();
		
		inputMap(people2);
		displayMap(people2);
		
		// TreeMap, Person은 커스텀 클래스라 Comparable 인터페이스를 구현해줘야함
		TreeMap<Person, Boolean> people3 = new TreeMap<>();
		
		inputMap(people3);
		displayMap(people3);
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵의 키와 value값을 출력한다
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println();
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// 맵에 Person 객체와 boolean을 입력(원격여부)
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false); // 중복이 되지 않는다
		map.put(new Person("둘리"), true); // 둘리의 value값 업데이트(false -> true)
	}
}
