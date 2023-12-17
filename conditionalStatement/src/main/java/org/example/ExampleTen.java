package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExampleTen
{
    //Write a pgm in java to input 5 numbers from keyboard and find their sum and verage
    public static void main(String[] args)
    {
       // Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 numbers :");
        int sum=0;double average;
        for (int i=1;i<=5;i++)
        {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            sum=sum+num;
        }
        average=sum/5;
        System.out.println("sum of five number are :"+sum);
        System.out.println("average of five number are :"+average);
    }
}
