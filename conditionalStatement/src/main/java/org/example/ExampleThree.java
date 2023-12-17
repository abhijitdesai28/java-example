package org.example;
import java.util.Scanner;

public class ExampleThree
{
//    Write a Java program that takes a year from the user and prints whether it is a leap year or not.
//
//Test Data
//Input the year: 2016
// Not done
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
         int year =scanner.nextInt();

         if(year%4==0 || year%400==0)
         {
             if(year%100==0)
             {
                 System.out.println("leap year");
             }
         }
         else
         {
             System.out.println(" not leap year");
         }
    }
}
