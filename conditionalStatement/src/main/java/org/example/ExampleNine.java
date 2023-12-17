package org.example;
import java.util.Scanner;
public class ExampleNine
{
    //Write a java pgm to display n terms of natural numbers and their sum

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers : ");
        int number = sc.nextInt();
        int sum=0;
        for (int i=1;i<=number;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum of natural number are :"+sum);
    }
}
