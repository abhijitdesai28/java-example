package methodOverloading;

public class Runner
{
    public static void main(String[] args) {
        //object creation
        MethodOverloadingDemo mod= new MethodOverloadingDemo();

        mod.display();//calling method or invoking

        System.out.println("-------------------------");

        mod.display(5);//calling method or invoking

        System.out.println("-------------------------");

        mod.display(10.5);//calling method or invoking

        System.out.println("------------------------");

        mod.display("abhijit",25);

        System.out.println("------------------------");
    }
}

