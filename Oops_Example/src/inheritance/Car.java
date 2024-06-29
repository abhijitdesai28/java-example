package inheritance;
/*
 * This program is example of Has-A relationship 
 * has-a relationship: creating one class object inside another class 
 * 
 * difference between Has-A and Is-A relationship
 * has-a relationship: creating one class object inside another class 
 * if one class want to re-use some properties  of another class then we will go 
 *   for Has-A relationship
 *    ex: composition is the example of Has-A relationship
 * 
 * Is-A relationship: nothing but Inheritance
 */
public class Car {
	void drive() {
		Engine e= new Engine();
		e.start();
		System.out.println("jurney started.....");
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();

	}

}
