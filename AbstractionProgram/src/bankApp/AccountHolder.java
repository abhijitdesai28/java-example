package bankApp;

public class AccountHolder
{
    public static void main(String[] args) {
        System.out.println("----------welcome in ATM--------");
        Bank b=new ATM() ;
        b.checkBalance();

        System.out.println("=========================");

        b.deposit(5000);
        b.checkBalance();

        System.out.println("=========================");

        b.withdraw(4000);
        b.checkBalance();

        System.out.println("=========================");

    }
}
