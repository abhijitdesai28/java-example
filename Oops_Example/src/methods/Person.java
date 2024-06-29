package methods;

import java.util.Arrays;

/*
 * write a java class with two methods
 * 1 method should take 2 person objects as input
 * 2 method should take 3person objects as output
 */

public class Person {
	int id;
	String name;
	
	Person[] m2() {
		Person p1=new Person();
		p1.id=101;
		p1.name="raju";
		
		Person p2=new Person();
		p2.id=102;
		p2.name="rani";
		
		Person p3=new Person();
		p2.id=103;
		p2.name="raghu";
		
		Person [] arr= {p1,p2,p3};
		return arr;
		
	}
	
	void m1 (Person p1,Person p2) {
		System.out.println(p1.id+" | "+p1.name);
		System.out.println(p2.id+" | "+p2.name);	
	}

	public static void main(String[] args) {
		Person p=new Person();
		
		Person p1=new Person();
		p1.id=101;
		p1.name="raju";
		
		Person p2=new Person();
		p2.id=102;
		p2.name="rani";
		
		p.m1(p1, p2);
		
		Person[] arr = p.m2();
		//approach1
		for(Person person:arr) {
			System.out.println(person.id+" |"+person.name);
		}
		
		//approach2
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].id+" |"+arr[i].name);
		}
	}

}
