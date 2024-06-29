package inheritance;

public class Student extends User{
	int rank=1;
	

	public static void main(String[] args) {
		//child class object creation
		Student s= new Student();
		s.rank=1;
		
		//accessing parent class properties using child class properties
		s.id=101;
		s.name="hima";
		
		System.out.println(s.id+" | "+s.rank+" |"+s.name);
		

	}

}
