package constructorDemo;

public class EmployeeNew
{
    int id;
    String name;
    double salary;

    //create constructor
    EmployeeNew(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    void display()
    {
        System.out.println("employee id :"+this.id);
        System.out.println("employee name :"+this.name);
        System.out.println("employee salary :"+this.salary);

    }

    public static void main(String[] args) {
        //object creation
        EmployeeNew en= new EmployeeNew(10,"ram",25000);
        en.display();
        System.out.println("-----------------------------------------");

        EmployeeNew en2= new EmployeeNew(11,"sham",45000);
        en2.display();
        System.out.println("------------------------------------------");


    }
}
