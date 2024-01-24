package constructorDemo;

public class Employee
{
    int id;
    String name;
    double salary;

    //create constructor
    Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public static void main(String[] args) {
        //object creation
        Employee e1  =new Employee(10,"Abhijit",15000);
        System.out.println("employee id :"+e1.id);
        System.out.println("employee name :"+e1.name);
        System.out.println("employee salary :"+e1.salary);
        System.out.println("---------------------------------------");

        Employee e2  =new Employee(11,"jit",20000);
        System.out.println("employee id :"+e2.id);
        System.out.println("employee name :"+e2.name);
        System.out.println("employee salary :"+e2.salary);
        System.out.println("---------------------------------------");

    }
}
