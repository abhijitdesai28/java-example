package bankApp;

public class ATM implements Bank
{
    double balance=10000;
    @Override
    public void deposit(double amount) {
        System.out.println("amount deposit :"+amount);
        balance+=amount;
        System.out.println("amount deposit successful!!");
    }

    @Override
    public void withdraw(double amount)
    {
        System.out.println("amount withdraw:"+amount);
        if (amount>balance)
        {
            System.out.println("sorry insufficient amount");
        }
        else
        {
            balance-=amount;
            System.out.println("amount successful withdraw!!");
        }

    }

    @Override
    public void checkBalance()
    {
        System.out.println("available balance :"+balance);
    }
}
