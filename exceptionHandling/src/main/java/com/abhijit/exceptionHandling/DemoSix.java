package com.abhijit.exceptionHandling;

public class DemoSix
{
    //in this program we demonstrate that finally block is always executed
    public static void main(String [] args)
    {
        try
        {
            System.out.println("abhijit");
            System.out.println(10/0);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("we r getting exception :"+ex);
        }
        finally {
            System.out.println("final block is always executed");
        }
    }

}
