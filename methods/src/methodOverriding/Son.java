package methodOverriding;

public class Son extends Father
{
   @Override
   void bike()
    {
        super.bike();
        System.out.println("son bike");
    }

    public static void main(String[] args) {
        System.out.println("main method start---");
        //create object
        Son s= new Son();
        s.bike();
        System.out.println("main method end---");

    }
}
