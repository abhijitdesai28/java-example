package calculatorApp;

import java.util.Scanner;

public class User
{
    public static void main(String[] args) {
        Calculator c=new Solution();
        System.out.println("------welcome in calculator-------");
        Scanner sc= new Scanner(System.in);
        while (true)
        {
            System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:EXIT");
            System.out.println("enter choice");
            int choice= sc.nextInt();
            System.out.println("enter first number:");
            int inputOne = sc.nextInt();
            System.out.println("enter second number:");
            int inputTwo=sc.nextInt();

            switch(choice)
            {

                case 1:
                    System.out.println("addition of two number :"+c.add(inputOne,inputTwo));
                    break;
                case 2:
                    System.out.println("subtraction of two number :"+c.subtract(inputOne,inputTwo));
                    break;
                case 3:
                    System.out.println("multiplication of two number :"+c.multiplication(inputOne,inputTwo));
                    break;
                case 4:
                    System.out.println("division of two number "+c.division(inputOne,inputTwo));
                    break;
                case 5:
                    System.out.println("thank u for using !! Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice select again");
            }
        }
    }
}
