package org.example;
import java.util.Scanner;

public class ExampleFive
{
//    Write a Java program that reads two floating-point numbers and tests
//    whether they are the same up to three decimal places.
//
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1:");
         double number1 =scanner.nextDouble();
        System.out.println("Enter a number2:");
        double number2 =scanner.nextDouble();

        number1=number1/1000;

        number2=number2/1000;

        if(number1==number2)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
