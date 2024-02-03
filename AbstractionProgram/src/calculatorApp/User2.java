package calculatorApp;

import java.util.Scanner;

public class User2
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

            if(choice>5)
            {
                System.out.println("invalid choice");
            } else if (choice==5)
            {
                System.out.println("thank u for use Exit");
                break;
            }
            System.out.println("enter first number:");
            int num1 = sc.nextInt();
            System.out.println("enter second number:");
            int num2=sc.nextInt();

            switch(choice)
            {

                case 1:
                    System.out.println("addition of two number :"+c.add(num1,num2));
                    break;
                case 2:
                    System.out.println("subtraction of two number :"+c.subtract(num1,num2));
                    break;
                case 3:
                    System.out.println("multiplication of two number :"+c.multiplication(num1,num2));
                    break;
                case 4:
                    if (num2!=0)
                    {
                        System.out.println("division of two number "+c.division(num1,num2));
                        break;
                    }
                    else {
                        System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
                    }

//                case 5:
//                    System.out.println("thank u for using !! Exit");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("invalid choice select again");
            }
        }
    }
}
