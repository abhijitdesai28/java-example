package variables;

public class InstanceVariable {
	int age;//instance variable

	public static void main(String[] args) {
		InstanceVariable abhi=new InstanceVariable();//object creation
		abhi.age=20;//Initializing instance variable
		System.out.println(abhi.age);//20 
		
		InstanceVariable jit=new InstanceVariable();//object creation
		jit.age=22;//Initializing instance variable
		System.out.println(jit.age);//22

	}

}
