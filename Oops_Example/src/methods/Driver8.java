package methods;
/**
 * raju data [101,raju,30]
 * rani data [102,rani,32]
 * write a java method which will take id as input. 
 * if id is 101 then method should return raju object
 * if id is 102 then method should return rani object
 */

public class Driver8 {
	
	Person get(int id) {
		Person p=new Person();
		if(id==101) {
			p.id=101;
			p.age=30;
			p.name="raju";
		}else if(id==102) {
			p.id=102;
			p.age=36;
			p.name="rani";
		}
		return p;	
	}
	
	public static void main(String[] args) {
		Driver8 d=new Driver8();
		Person person = d.get(102);
		System.out.println(person.id+" |"+person.age +" |"+person.name);
	}

}

class Person{
	int id;
	int age;
	String name;
}
