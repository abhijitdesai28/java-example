package objectClass_toStringMethod;

public class Employee
{
    String name;
    int id;

    //create constructor
    public Employee(String name,int id)
    {
      this. name= name;
      this.id=  id;
    }

    //override toString() method
    public String toString()
    {
        return "employee id of "+name+" is "+id;
    }
    public static void main(String[] args) {
        //object creation
        Employee e1= new Employee("ram",10);
        Employee e2= new Employee("sham",11);
        Employee e3= new Employee("dham",12);

        //print respective values
        System.out.println(e1);//employee id of ram is 10
        System.out.println(e2);//employee id of sham is 11
        System.out.println(e3);//employee id of dham is 12
    }
}
