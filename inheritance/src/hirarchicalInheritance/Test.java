package hirarchicalInheritance;

public class Test
{
    public static void main(String[] args) {
        //create object
        Bike b= new Bike();
        System.out.println(b.Brand);
        System.out.println(b.fuel);
        b.engin();
        System.out.println("--------------------------------");

        Car c= new Car();
        System.out.println(c.Brand);
        System.out.println(c.fuel);
        c.start();
    }
}
