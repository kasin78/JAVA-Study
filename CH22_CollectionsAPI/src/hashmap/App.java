package hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// 해시맵은 키, value값을 입력한다
		HashMap<Integer, String> people = new HashMap<>();
		
		people.put(0, "펭수");
		people.put(1, "길동");
		people.put(3, "라이언");
		people.put(4, "프레드");
		people.put(4, "마이클"); // 키값은 중복되지 않는다, 덮어쓰기 키값 4(프레드 -> 마이클)
		people.put(10, "수지");
		
		System.out.println(people.get(0)); // 키값에 해당하는 value값을 가져옴
		
		String person = people.get(10);
		System.out.println(person);
		
		// 람다식
		people.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
		
	System.out.println("=============");
		
	    // 내가한 틀린 방법(수정가능할까?)
		for (int i = 0; i < people.size(); i++) { 
			System.out.println(people.get(i));
		}
	}
}
