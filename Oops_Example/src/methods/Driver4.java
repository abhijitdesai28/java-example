package methods;
/**
 * take doctor class with DoctortAge ,DocterName as properties
 * create driver class with print method to print Doctor data
 */

public class Driver4 {
	void print(Doctor d) {
		System.out.println("Doctor name:"+d.name+"   |Docter age:"+d.age);
		
	}

	public static void main(String[] args) {
		Driver4 d= new Driver4();
		Doctor doctor=new Doctor();
		doctor.name="m.s.patil";
		doctor.age=36;
		d.print(doctor);
	}
}

class Doctor{
	String name;
	int age;
}
