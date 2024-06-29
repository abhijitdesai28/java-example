package encapsulation;

public class Person {
	//instance variable
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private Long phonno;
	private String city;
	private String state;
	private String country;
	
	//declare getter and setter method
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setFname(String fname) {
		this.fname=fname;
	}
	
	public String getFname() {
		return this.fname;
	}
	
	public void setlname(String lname) {
		this.lname=lname;
	}
	
	public String getlname() {
		return this.lname;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setphonno(long phonno) {
		this.phonno=phonno;
	}
	
	public long getphonno() {
		return this.phonno;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	
	public String getCountry() {
		return this.country;
	}
}
