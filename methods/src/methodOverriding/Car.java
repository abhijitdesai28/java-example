package methodOverriding;

public class Car extends Vehicle
{

    @Override
    void start()
    {
        System.out.println("car started :");
    }

    void shiftGears()
    {
        System.out.println("Gears Shifted :");
    }
}
