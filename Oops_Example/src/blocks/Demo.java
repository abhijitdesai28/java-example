package blocks;

public class Demo {
	
	//static block
	static {
		System.out.println("im from static blocks");
	}
	
	//non-static block
	{
		System.out.println("im from non-static block");
	}

	public static void main(String[] args) {
		System.out.println("im from main method");
		Demo d= new Demo();
	}

}
