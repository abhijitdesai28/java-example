package constructorOverloading;

public class Vehicle
{
    Vehicle(String brand,int cost)
    {
        System.out.println("Brand :"+brand  +" and cost :"+cost);
    }
    Vehicle(String brand)
    {
        System.out.println("Brand :"+brand);
    }
    Vehicle(String brand, String fuel)
    {
        System.out.println("brand :"+brand +" and fuel :"+fuel);

    }
    Vehicle(int cost,String brand)
    {
        System.out.println("Cost :"+cost +" and brand :"+brand);

    }

    public static void main(String[] args) {
        Vehicle v1= new Vehicle("BMW");
        Vehicle v2= new Vehicle("suzuki",900000);
        Vehicle v3= new Vehicle("BMW","petrol");
        Vehicle v4= new Vehicle(10000,"crysta");
    }
}
