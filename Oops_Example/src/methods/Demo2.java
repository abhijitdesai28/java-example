package methods;
/**
 * Scenario-2
 * This program  will demonstrate Example on non-static method with-out formal argument
 * and with return type
 */
public class Demo2 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();//object creation 
		System.out.println(d.add());//calling non-static method with object ref
	}
	
	int add() {
		int a=10;
		int b=20;
		int c=a+b;//30
		return c;
	}

}
