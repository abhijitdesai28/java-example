package in.SalaryExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//groupBy Operation :is nothing but categories data
public class SecondDemo {
    public static void main(String[] args) {
        Person p1= new Person(1,"robert",25000.00,"USA");
        Person p2= new Person(2,"david",2000.00,"INDIA");
        Person p3= new Person(3,"smith",65000.00,"USA");
        Person p4= new Person(4,"rock",55000.00,"INDIA");
        Person p5= new Person(5,"jasmin",5000.00,"JAPAN");
        List<Person> list = Arrays.asList(p1, p2, p3, p4, p5);

        Map<String, List<Person>> data = list.stream().collect(Collectors.groupingBy(e -> e.country));
        System.out.println(data);
    }
}

class Person{
    int id;
    String name;
    double salary;
    String country;

    Person(int id,String name,double salary,String country){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", country='" + country + '\'' +
                '}';
    }
}