package methodOverloading;

public class MethodOverloadingDemo
{
    void display()
    {
        System.out.println("hello daba Fellow");
    }

    void display(int x)
    {
        System.out.println("given value inside x:"+x);
    }

    void display(double x)
    {
        System.out.println("given double value x:"+x);
    }

    void display(String name , int age)
    {
        System.out.println("given name :"+name +" , and age :"+age);
    }




}
