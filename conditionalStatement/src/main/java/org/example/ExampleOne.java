package org.example;
import java.util.Scanner;
public class ExampleOne
{
//    Write a Java program to get a number from the user and print whether it is positive or negative.
//
//    Test Data
//    Input number: 35
//    Expected Output : Number is positive
//    done
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
         String number =scanner.nextLine();

         if(Integer.valueOf(number)>0)
         {
             System.out.println("Given number:"+number +" is Positive number");
         }
         else if(Integer.valueOf(number)==0)
         {
             System.out.println("Given number:"+number +" is equal number");
         }
         else
         {
             System.out.println("Given number:"+number +" is Negative number");
         }
    }
}
