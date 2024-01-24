package constructorChaining;

public class Employee
{
    Employee(int id)//101
    {
        System.out.println(id);//101
    }
    Employee(int id,String name)//101,abhi
    {
        this(id);//id=101
        System.out.println(name);//abhi
    }

    public static void main(String[] args) {
        Employee e= new Employee(101,"abhi");
    }
}
