package com.abhijit.exceptionHandling;

public class DemoTwo
{
    //in this program we demonstrate how to handle exception using try catch block
    public static void main(String[] args)
    {
        System.out.println("abhijit");
        System.out.println("dhanaji");
        try
        {
            System.out.println(10/0);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("you are getting exception :"+ex);
        }
        System.out.println("desai");
    }
}

//OUTPUT:
//        abhijit
//        dhanaji
//        you are getting exception :java.lang.ArithmeticException: / by zero
//        desai

