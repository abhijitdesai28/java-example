package compileTimePolymorphism;

public class Myntra
{
    void purchase(String productName)
    {
        System.out.println(productName);
    }
    void purchase(int productId)
    {
        System.out.println(productId);

    }
    void purchase(String productName,int cost)
    {
        System.out.println(productName+ " "+cost);
    }
    void purchase(int cost,String productName)
    {
        System.out.println(cost+" "+productName);
    }
}
