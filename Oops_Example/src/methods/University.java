package methods;
/*
 * write a java method to return university data based on university id
 * 101----id:101/name:oxford
 * 102----id:102/name:standford
 */

public class University {
	int id;
	String name;
	static University get(int id) {
		University u= new University();
		if(id==101) {
			u.id=101;
			u.name="Oxford";
		}else if(id==102) {
			u.id=102;
			u.name="StandFord";
		}
		return u;
		
	}

	public static void main(String[] args) {
		University u = University.get(102);
		System.out.println(u.id+" | "+u.name);
		
		

	}

}
