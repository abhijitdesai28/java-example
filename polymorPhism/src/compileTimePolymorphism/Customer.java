package compileTimePolymorphism;

public class Customer
{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //myntra object creation
        Myntra m= new Myntra();
        m.purchase(100);//second method called
        m.purchase(1000,"mobile");
        m.purchase("laptop");
        m.purchase("shoe",5000);


    }
}