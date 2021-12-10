package Java_Api;

import java.util.HashMap;

public class ex8 {

	public static void main(String[] args) {
		System.out.println(solution(new String[]{"병주", "병헌", });
		System.out.println();
		System.out.println();
		
	}
	
	private static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String name : participant) {
			if (hm.get(name) == null) {
				hm.put(name, 1);
			}
			else {
				int value = hm.get(name) + 1;
				hm.put(name, value);
			}
		}
		
		for (String name : completion) {
			
		}
		
		for (String name : hm.keySet()) {
			if( == 1) {
				answer = name;
			}
		}

		return answer;
	}
}