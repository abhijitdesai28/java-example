package com.abhijit.exceptionHandling;

public class DemoFour
{//if there is no exception in try blocks the catch blocks won't be executed
    public static void main(String [] args)
    {
        System.out.println("program start");
        try
        {
            System.out.println("abhijit");
            System.out.println("how are you");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("we are getting exception");
        }
        System.out.println("program end");
    }
}
