package methods;

public class Driver7 {
	Collage get() {
		Collage c= new Collage();
		c.id=1;
		c.name="MIt";
		return c;
		
	}

	public static void main(String[] args) {
		Driver7 driver=new Driver7();
		Collage c = driver.get();
		System.out.println(c.id+"   | "+c.name);
		
	}

}

class Collage{
	int id;
	String name;
}
