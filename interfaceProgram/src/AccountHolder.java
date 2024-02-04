public class AccountHolder implements HDFCBank
{
    @Override
    public void withdraw()
    {
        System.out.println("withdraw money");
    }

    @Override
    public void deposit()
    {
        System.out.println("Deposited");
    }

    public static void main(String[] args) {

        System.out.println("-----main method start-----");
        AccountHolder acc= new AccountHolder();
        acc.deposit();
        acc.withdraw();
        System.out.println("-----main method end------");
    }
}
