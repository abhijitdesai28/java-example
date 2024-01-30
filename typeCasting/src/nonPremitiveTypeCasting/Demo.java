package nonPremitiveTypeCasting;

public class Demo
{
    public static void main(String[] args) {
        //Upcasting
        Vehicle v=new Car();
        System.out.println("v.brand ="+v.brand);
        v.start();

        System.out.println("-------------------------------------");

        //DawnCasting
        Car c= (Car) v;
        System.out.println("c.brand="+c.brand);
        System.out.println("c.fuel ="+c.fuel);
        c.start();
        c.stop();
        System.out.println("------------------------------------");
    }
}
