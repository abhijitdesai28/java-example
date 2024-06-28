package methods;
/**
 * Write a java method which will give person object with data
 */
public class Driver6 {
	
	Person get() {
		Person p= new Person();
		p.id=101;
		p.age=25;
		p.name="sandip";
		return p;
		
	}
	
	public static void main(String[] args) {
		Driver6 d= new Driver6();
		Person person = d.get();
		System.out.println(person.id+" |"+person.age+" |"+person.name);

	}

}

class Person{
	int id;
	int age;
	String name;
}
