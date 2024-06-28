package methods;
/**
 * take product class with ProductId ,ProductName,ProductPrice
 * create driver class with print method to print product data
 */

public class Driver3 {
	
	void print(Product p) {
		System.out.println(p.productId + " |"+ p.productName+" |"+ p.productPrice);
		
	}

	public static void main(String[] args) {
		Driver3 d=new Driver3();
		Product p =new Product();
		p.productId=01;
		p.productName="Gokul Milk";
		p.productPrice=45.00;
		d.print(p);

	}

}

class Product{
	int productId;
	String productName;
	double productPrice;
}
