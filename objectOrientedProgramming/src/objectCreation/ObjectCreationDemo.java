package objectCreation;

public class ObjectCreationDemo
{
    //global variable
    int age=25;
    String name="ABHIJIT";

    public static void main(String[] args)
    {
        System.out.println("------------START--------------");

        ObjectCreationDemo ocd = new ObjectCreationDemo();// object creation

        System.out.println("Printing age with the help of object reference :"+ocd.age);

        System.out.println("printing name with the help of object reference :"+ocd.name);

        System.out.println("-----------END-------------------");

    }
}
//NOTES:
//object creation is also called as instantiation
//we create object to store non-static properties within the memory
//object is created in heap area