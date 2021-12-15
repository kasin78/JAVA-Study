package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
	    /* 0 ~ 10 값이 아닌 값들은 모두 제거
		   제거하고 남은 아이템들에 각각 +100
		   그 결과를 콘솔로 표시 */
		
		list.removeIf(t -> t > 10 || t < 0); // 0보다 작거나 10보다 크면 true -> 삭제
		// 두번 나눠서 해도 됨
		//list.removeIf(t -> t > 10);
		//list.removeIf(t -> t < 0);
		
		list.replaceAll(a -> a + 100); // 각 아이템들을 +100한 값으로 대체
		
		list.forEach(l -> System.out.println(l));       // 1. replaceAll로 이미 +100이 된 값들 출력
	  //list.forEach(l -> System.out.println(l + 100)); // 2. 각 아이템들에 +100하면서 출력, 이 경우에는 replaceAll 주석 처리
	}
}
