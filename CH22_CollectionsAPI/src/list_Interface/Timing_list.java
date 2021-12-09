package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// ArrayList와 LinkedList의 실행시간
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		/* // 시간체크 하는법
		long time1 = System.currentTimeMillis(); // 현재시간을 1/1000초로 리턴
		System.out.println(time1);
		
		// 리스트 실행하고
		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
		long time2 = System.currentTimeMillis(); // 현재시간을 1/1000초로 리턴
		System.out.println(time2 - time1); // 걸린 시간 */
		
		long duration = timeOperations(arrayList);
		long duration2 = timeOperations(linkedList);
		
		System.out.println("arrayList 측정시간 : " + duration);
		System.out.println("linkedList 측정시간 : " + duration2);
		
		// 일반적인 순서대로 입력은 ArrayList가 2배정도 더 빠름
		// 특정 인덱스 번호에 입력이나 제거는 링크드 리스트가 훨씬 빠름

	}
	
	public static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis(); // 시간측정
		
		for (int i = 0; i < 100000; i++) {
			list.add(0, i); // 인덱스 번호 0에 0부터 10만-1까지 리스트에 하나씩 입력
		}
		
		return System.currentTimeMillis() - start; // 실행시간 리턴
	}

}
