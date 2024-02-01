package runTimepolymorphism;

public class Solution
{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();

        System.out.println("----------------");

        Vehicle v2= new Bike();
        v2.start();

    }
}
