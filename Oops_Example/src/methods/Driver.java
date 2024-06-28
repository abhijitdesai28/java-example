package methods;

import java.util.Arrays;

public class Driver {
	//non-static method
	void print(int []arr) {
		String str=Arrays.toString(arr);
		System.out.println(str);//[101, 102, 103]
		
	}

	public static void main(String[] args) {
		Driver d= new Driver();//object creation
		int []arr= {101,102,103};
		d.print(arr);//calling method with object reference
	}
}
