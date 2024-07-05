package in.SalaryExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//write a java program to get MAX,MIN,AVG salary from given employees data using stream API.
public class FirstDemo {
    public static void main(String[] args){
        Employee e1= new Employee(1,"robert",25000.00);
        Employee e2= new Employee(2,"david",2000.00);
        Employee e3= new Employee(3,"smith",65000.00);
        Employee e4= new Employee(4,"rock",55000.00);
        Employee e5= new Employee(5,"jasmin",5000.00);
        //Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);
        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);

        //maximum salary
        Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
        System.out.println("maximum salary: "+max.get().salary);

        //minimum salary
        Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
        System.out.println("minimum salary:"+min.get().salary);

        //average salary
        Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println("avg salary :"+avg);
    }
}

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
