package application;

public class Increment {

	public static void main(String[] args) {
		// 증가*감소 연산자(1씩 증가 또는 감소)
		int count = 0;
		
		count = count + 1; 
	 // count = count - 1
		System.out.println(count); // 0 + 1 = 1
		
		count += 1; 
	 // count -= 1; // count = count - 1 
		System.out.println(count); // 1 + 1 = 2
		
		count++;
     // count--;
		System.out.println(count);
		
		++count; 
     // --count;
		System.out.println(count);
		
		System.out.print("==============\n");
		
		// 위와 같이 4가지 방법으로 감소를 시키는 프로그램
		int minus = 5;
		
		minus = minus - 1;
		System.out.println(minus);
		
		minus -= 1;
		System.out.println(minus);
		
		minus--;
		System.out.println(minus);
		
		--minus;
		System.out.println(minus);
	}

}
