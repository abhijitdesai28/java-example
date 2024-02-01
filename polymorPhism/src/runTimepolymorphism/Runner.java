package runTimepolymorphism;

public class Runner
{
    public static void main(String[] args) {

        Employee e1= new Developer();
        e1.work();

        Employee e2= new Tester();
        e2.work();

        System.out.println("------------------");

        Employee emp;

        emp = new Developer();
        emp.work();

        emp=new Tester();
        emp.work();

    }
}
