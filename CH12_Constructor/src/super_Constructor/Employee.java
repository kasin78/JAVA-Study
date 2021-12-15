package super_Constructor;

public class Employee extends Person { // Employee는 Person으로부터 상속 받음(자식)
	public Employee() {
		super("익명"); // 부모클래스의 생성자, 기본적으로 super();가 생략되어있음
		System.out.println("Employee 생성자");
		// 따라서, Person 생성자 먼저 실행되고 Employee 생성자가 실행됨
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
