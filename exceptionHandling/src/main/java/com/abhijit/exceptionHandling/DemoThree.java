package com.abhijit.exceptionHandling;

public class DemoThree
{
    //in this program we demonstrate how we are getting exception related to array and handle
      //using try catch
    public static void main(String[] args) {
        System.out.println("program start");
        try
        {
            int[] a={10,20,30};
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
            System.out.println(a[3]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("we r getting exception :"+ex);
        }
        System.out.println("program end");
    }
}
