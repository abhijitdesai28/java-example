package org.example;
import java.util.Scanner;

public class ExampleSix
{
//   Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
//   Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
//   or "large" if it exceeds 1,000,000.
//
//Test Data
//Input a number: 25
//Expected Output :
//Input value: 25
//Positive number

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
         double number =scanner.nextDouble();

         if(number>0)
         {
             if(number<1)
             {
                 System.out.println("Positive Small number");
             }
             else if (number > 1000000)
             {
                 System.out.println("Positive Large number");
             }
             else
             {
                 System.out.println("Positive number");
             }
         }
         else if (number < 0)
         {
             if (number < -1)
             {
                 System.out.println("Negative Small number");
             }
             else if (number > 1000000)
             {
                 System.out.println("Negative Large number");
             }
             else
             {
                 System.out.println("Negative number");
             }
         }
         else
         {
             System.out.println("Zero");
         }
    }
}
