package runTimepolymorphism;

public class MainClass
{
    void invokeWork(Employee emp)
    {
        emp.work();
    }
    public static void main(String[] args) {
        MainClass m= new MainClass();
        m.invokeWork(new Tester());
        m.invokeWork(new Developer());
    }
}
