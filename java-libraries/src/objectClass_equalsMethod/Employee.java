package objectClass_equalsMethod;

public class Employee
{
    int id;
    double height;

    //create constructor
    public Employee(int id,double height)
    {
        this.id=id;
        this.height=height;

    }

    //override equals method to check content

    public static void main(String[] args)
    {
        //create objects
        Employee e1= new Employee(10,5.5);
        Employee e2= new Employee(11,5.9);

        System.out.println(e1.equals(e2));//false
        System.out.println("========================================");

        System.out.println(new Employee(11,4.5).equals(new Employee(1,4.5)));//false

        System.out.println("=============================================");

        if(e1.equals(e2))
        {
            System.out.println("content are same");//
        }
        System.out.println("content are Different");//content are different


    }
}
