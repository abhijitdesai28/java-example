public class Employee
{
    int id;

    {
        System.out.println("initializing id to :10");
        id=20;
    }

    public static void main(String[] args) {
        System.out.println("main method start");
        Employee e= new Employee();
        System.out.println(e.id);
        System.out.println("main method end");
    }

    {
        System.out.println("initializing id to :20");
        id=20;
    }
}

/*
     OUTPUT:
        main method start
        initializing id to :10
        initializing id to :20
        20
        main method end

 */
