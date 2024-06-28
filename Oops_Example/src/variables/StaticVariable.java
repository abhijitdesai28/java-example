package variables;

public class StaticVariable {
	String name;//instance variable
	String email;//instance variable
	static String university;// static variable

	public static void main(String[] args) {
		StaticVariable.university="SPPU";//Initializing static variable
		
		
		StaticVariable sv=new StaticVariable();//creating object
		sv.name="ram";//initializing instance variable
		
		System.out.println(sv.name);
		System.out.println(sv.university);
		System.out.println(StaticVariable.university);
		
		
		
		

	}

}
