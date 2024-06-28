package methods;
/**
 * Scenario-1
 * This program will demonstrate Example on non-static method with formal argument
 * and without return type
 */
public class Demo {

	public static void main(String[] args) {
		Demo d=new Demo();//object creation
		d.add(10, 15);//calling method with object reference
	}
	
	//non-static method
	void add(int a,int b) {
		int c=a+b;//10+15
		System.out.println(c);//25
		}
}
