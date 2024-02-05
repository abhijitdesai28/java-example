package store_Object_InsideArray;

public class Laptop
{
    String brand;
    int cost;
    String ramSize;

    //MAKE CONSTRUCTOR
    public Laptop(String brand,int cost,String ramSize)
    {
        this.brand=brand;
        this.cost=cost;
        this.ramSize=ramSize;
    }

    //override toString() method
    public String toString()
    {
        return "Brand :"+brand +"| Cost :"+cost +"| RamSize :"+ramSize;
    }

}
