package methods;

public class Demo4 {
	//Non-Static method/Instance method
	void sayHello() {
		System.out.println("Hello my friend...");
	}
	
	//Static method
	static void greet() {
		System.out.println("Good morning");
	}

	public static void main(String[] args) {
		Demo4 d= new Demo4();//object creation
		d.sayHello();//invoking instance method
		Demo4.greet();//invoking static method
		

	}

}
