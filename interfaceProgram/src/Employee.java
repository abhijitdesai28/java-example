public class Employee extends XYZCompany implements Developer,Tester
{
    @Override
    public void develop()
    {
        System.out.println("develop application");
    }

    @Override
    public void test()
    {
        System.out.println("test application");
    }

    //optionally we can Override work

    public static void main(String[] args)
    {
        System.out.println("-----main method start-----");
        Employee e= new Employee();
        e.develop();
        e.work();
        e.test();
        System.out.println("-----main method end-----");

    }

}
