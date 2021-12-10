package Java_Api;

import java.util.ArrayList;

class Chicken {
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Chicken [name=" + name + ", price=" + price + "]";
	}
	public int getPrice() {
		return price;
	}
}
public class ex1 {
	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Chicken> orders = new ArrayList<>();
		
		// 주문한 치킨을 ArrayList에 추가
		orders.add(new Chicken("로스트 치킨", 9900));
		orders.add(new Chicken("파닭 치킨", 12900));
		orders.add(new Chicken("마늘아 치킨", 13900));
		
		// ArrayList를 순회하여 총합 구하기
		int sum = 0;
		for (int i = 0; i < orders.size(); i++) {
			sum += orders.get(i).getPrice();
		}
		
		System.out.printf("총합 : %d원 \n", sum);
	}
}
