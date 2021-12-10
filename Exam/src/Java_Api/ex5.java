package Java_Api;

import java.util.ArrayList;

class Store {
	private ArrayList<Menu> list;
	
	public Store() {
		this.list = new ArrayList<Menu>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	public int totalSales() {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getPrice()*list.get(i).getCount();	
		}
		return sum;
	}
}

class Menu {
	private String name;
	private int price;
	private int count;
	
	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
}

public class ex5 {

	public static void main(String[] args) {
		// 메뉴 객체 생성
		Menu menu1 = new Menu("김밥", 2000, 57);
		Menu menu2 = new Menu("돈까스", 6000, 29);
		Menu menu3 = new Menu("냉면", 5000, 34);
		
		// 스토어 객체에 메뉴 추가
		Store myStore = new Store();
		
		myStore.add(menu1);
		myStore.add(menu2);
		myStore.add(menu3);
		
		// 하루 총 매출을 계산
		System.out.printf("총 매출 : %d원", myStore.totalSales());
	}
}
