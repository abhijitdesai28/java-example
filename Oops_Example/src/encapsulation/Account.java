package encapsulation;

public class Account {
	private int accNum;//instance variable
	private String accName;//instance variable
	
	//declare Setter method
	public void setAccNum(int accNum) {
		this.accNum=accNum;
	}
	
	//Declare getter method
	public int getAccNum() {
		return this.accNum;
	}
	
	//declare setter method
	public void setAccName(String accName) {
		this.accName=accName;
	}
	
	//declare getter method
	public String getAccName() {
		return this.accName;
	}
	
	

}
