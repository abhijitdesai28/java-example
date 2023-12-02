package org.example;
import java.util.Scanner;

public class ExampleTwo
{
//   Write a Java program that takes three numbers from the user and prints the greatest number.
//
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output : The greatest: 87

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1:");
         String number1 =scanner.nextLine();
        System.out.println("Enter a number2:");
        String number2 =scanner.nextLine();
        System.out.println("Enter a number3:");
        String number3 =scanner.nextLine();


       /*  if(Integer.valueOf(number1)>Integer.valueOf(number2))
         {
             if(Integer.valueOf(number1)>Integer.valueOf(number3))
             {
                 System.out.println("Given number is greater number:"+number1);
             }
         }
        else if(Integer.valueOf(number2)>Integer.valueOf(number1))
        {
            if(Integer.valueOf(number2)>Integer.valueOf(number3))
            {
                System.out.println("Given number is greater number:"+number2);
            }
        }
        else if(Integer.valueOf(number3)>Integer.valueOf(number1) )
         {
             if(Integer.valueOf(number3)>Integer.valueOf(number2))
             {
                 System.out.println("Given number is greater number:"+number3);

             }
         } */


    }
}
