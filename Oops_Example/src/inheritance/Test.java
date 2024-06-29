package inheritance;

class Parent{
	void m1() {
		System.out.println("called parent class -- m1() method ");
	}
}

class Child extends Parent {
	void m2() {
		System.out.println("called child class -- m2() method ");
	}
}

public class Test {

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();

	}

}
