package encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account();
		account.setAccNum(12345);
		account.setAccName("ramesh");
		int accountNum = account.getAccNum();
		String accountName = account.getAccName();
		System.out.println(accountNum+"   | "+accountName);

	}

}
