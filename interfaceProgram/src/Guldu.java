public class Guldu implements Person
{
    @Override
    public void eat() {
        System.out.println("Eating Biryani");
    }

    public static void main(String[] args)
    {
        System.out.println("------main method start------");
        System.out.println(Person.id);// we access with class name bcz id is static

        Guldu g= new Guldu();
        g.eat();//we access with object bcz its non-static

        System.out.println("------main method end------");
    }
}