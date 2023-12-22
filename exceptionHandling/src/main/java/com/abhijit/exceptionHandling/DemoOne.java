package com.abhijit.exceptionHandling;

public class DemoOne
{
    //in this program we demonstrate how we get exception
    public static void main(String[] args)
    {
        System.out.println("abhijit");
        System.out.println("dhanaji");
        System.out.println(10/0);
        System.out.println("desai");
    }
}
//OUTPUT:
//        abhijit
//        dhanaji
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at com.abhijit.exceptionHandling.DemoOne.main(DemoOne.java:9)
