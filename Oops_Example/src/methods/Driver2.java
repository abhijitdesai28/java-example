package methods;
/**
 * Take employee class with id and salary as properties
 * take driver class and write print method to print employee object data
 * call the print method from main method
 */

public class Driver2 {
	
	void print(Employee e) {
		System.out.println(e.id+"   "+e.salary);
		
	}

	public static void main(String[] args) {
		Driver2 d=new Driver2();
		Employee e=new Employee();
		e.id=101;
		e.salary=15000.00;
		d.print(e);
	}

}

class Employee{
	int id;
	double salary;
}
