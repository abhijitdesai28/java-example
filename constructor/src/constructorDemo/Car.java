package constructorDemo;

public class Car
{
    //create constructor
    //NON-PARAMETERIZED custom constructor
    Car()
    {
        System.out.println("hey im constructor");

    }
    public static void main(String[] args)
    {
        System.out.println("---main method start---");

        //constructor are executed when we create object
        Car c= new Car();

        System.out.println("---main method end---");
    }
}

/*
     OUTPUT:
     ---main method start---
       hey im constructor
     ---main method end---

 */
