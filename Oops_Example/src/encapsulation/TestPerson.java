package encapsulation;

public class TestPerson {

	public static void main(String[] args) {
		Person p= new Person();
		p.setId(1);
		p.setFname("ram");
		p.setlname("rathod");
		p.setGender("male");
		p.setphonno(123456);
		p.setCity("pune");
		p.setState("maharashtra");
		p.setCountry("india");
		
		int id = p.getId();
		String fname = p.getFname();
		String lname = p.getlname();
		String gender = p.getGender();
		long phone = p.getphonno();
		String city = p.getCity();
		String state = p.getState();
		String country = p.getCountry();
		
		System.out.println(id +" | "+fname+" | "+lname+" | "+gender+" | "+phone+" | "+city+" | "+
		state+" | "+country);

	}

}
