package bankApp;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
        System.out.println("-------Welcome to ATM-------");

        Bank b= new ATM();
        Scanner scanner=  new Scanner(System.in);

        while (true)
        {
            System.out.println("1:Deposit\n2:Withdraw\n3:Check Balance\n4:Exit");
            System.out.println("Enter choise");
            int choice =scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("enter amount to deposit :");
                    double deposit=scanner.nextInt();
                    b.deposit(deposit);
                    break;

                    /*
                    to minimize above line
                    b.deposit(scanner.nextInt());

                     */

                case 2:
                    System.out.println("enter amount to withdraw :");
                    double withdraw=scanner.nextInt();
                    b.withdraw(withdraw);
                    break;

                case 3:
                    System.out.println("check available balance :");
                    b.checkBalance();
                    break;

                case 4:
                    System.out.println("For Exit!!!");
                    System.out.println("Thank u:::");
                    System.exit(0);

                default:
                    System.out.println("invalid choice");

            }
        }

    }
}
