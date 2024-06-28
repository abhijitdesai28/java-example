package methods;
/**
 * Write a java method to print data  in the student object 
 */

public class Driver1 {
	
	void print(Student s) {
		int id=s.id;
		String name=s.name;
		System.out.println(id +" "+name);
		
	}

	public static void main(String[] args) {
		Driver1 d= new Driver1();
		Student s=new Student();
		s.id=10;
		s.name="abhi";
		d.print(s);
		

	}

}

class Student{
	int id;
	String name;
}
