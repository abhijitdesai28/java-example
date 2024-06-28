package methods;
/**
 * Scenario-3
 * This program  will demonstrate Example on non-static method with-out formal argument
 * and with-out return type
 */

public class Demo3 {

	public static void main(String[] args) {
		Demo3 d=new Demo3();//object creation 
		d.message();//calling non-static method with object reference

	}
	
	void message() {
		System.out.println("hello pune,a warm welcome");//hello pune,a warm welcome
	}

}
