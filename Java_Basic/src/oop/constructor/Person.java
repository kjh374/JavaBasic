package oop.constructor;

public class Person {

	String name;
	int age;
	int key;
	
	Person(){
		
	}
	
	Person(String a, int b, int c){
		name = a;
		age = b;
		key = c;
		info();
	}
	void info() {
		System.out.println("*** 정보 ***");
		System.out.printf("이름: %s, 나이: 만 %d세, 키: %d cm\n", name, age, key);
		
	}
}