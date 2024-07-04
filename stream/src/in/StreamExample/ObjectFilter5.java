package in.StreamExample;

import java.util.stream.Stream;

//write a pgm to get employee whose salary is greater than 50000
public class ObjectFilter5 {
    public static void main(String[] args){
        Employee e1=new Employee("om",25,15000);
        Employee e2=new Employee("ram",35,60000);
        Employee e3=new Employee("Sham",55,700000);
        Employee e4=new Employee("Sandip",65,20000);
        Employee e5=new Employee("Harsha",45,35000);

        //Stream.of()- method will give u stream object

        Stream<Employee> emp = Stream.of(e1, e2, e3, e4, e5);

        //Approach:1
        emp.filter(employee -> employee.salary>=50000)
                .forEach(employee -> System.out.println(employee.name+"  "+employee.age));

        //Approach:2
       emp.filter(e->e.salary>=50000)
                        .map(e->e.name+"  | "+e.age)
                         .forEach(employee->System.out.println(employee));
    }
}

class Employee{
    String name;
    int age;
    double salary;

    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
