package methodOverriding;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("main method start :");
        //create object
        Car c = new Car();
        c.start();
        c.shiftGears();
        System.out.println("main method end ");


    }

}
