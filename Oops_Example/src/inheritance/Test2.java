package inheritance;

class Parent1{
	void m1() {
		System.out.println("called parent class -- m1() method ");
	}
}

class Child1 extends Parent {
	void m1() {
		System.out.println("called child class -- m1() method ");
	}
	
	void m2() {
		System.out.println("called child class -- m2() method ");
	}
}

public class Test2 {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.m1();
		c.m2();
		int hashcode = c.hashCode();
		System.out.println("hashcode ::"+hashcode);	

	}

}
