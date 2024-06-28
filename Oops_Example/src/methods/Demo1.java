package methods;
/**
 * Scenario-2
 * This program will demonstrate Example on non-static method with formal argument
 * and with return type
 */

public class Demo1 {

	public static void main(String[] args) {
		Demo1 d=new Demo1();//object creation
		d.add(45, 50);//calling method with object reference
		System.out.println(d.add(4, 4));//8
	
	}
	//non-static method
	int add(int a,int b) {
		return a+b;
	}

}
