package com.abhijit.exceptionHandling;
import java.util.Scanner;

public class DemoSeven
{
    //int this pgm we demonstrate how handle exception using throw
    static void validate(int age)
    {
        if (age < 18)
        {
            throw new ArithmeticException("not eligible for vote");
        }
        else
        {
            System.out.println("welcome to the voting");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age :");
        int n=  sc.nextInt();
        validate(n);
        System.out.println("program end");
    }
}
