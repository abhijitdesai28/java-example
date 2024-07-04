package in.StreamExample;

import java.util.Arrays;
import java.util.List;

public class MatchOperation {
    public static void main(String[] args){
        Person p1=new Person("sagar","india");
        Person p2=new Person("rok","uk");
        Person p3=new Person("david","usa");
        Person p4=new Person("kil","canda");
        Person p5=new Person("kimjong","japan");

        List<Person> person = Arrays.asList(p1, p2, p3, p4, p5);

        //anyMatch: if it matches with one record it will give 'true'
        boolean status1 = person.stream().anyMatch(c -> c.country.equals("india"));
        System.out.println("any indian available :"+status1);//true

        boolean status2 = person.stream().anyMatch(c -> c.country.equals("china"));
        System.out.println("any chins available :"+status2);//false

        //allMatch: if all match available then it will give 'true'
        boolean status3 = person.stream().allMatch(c -> c.country.equals("india"));
        System.out.println("all indians available :"+status3);//false

        //noneMatch: if not a single record available then it will give 'true'
        boolean status4 = person.stream().noneMatch(c -> c.country.equals("maxico"));
        System.out.println("not maxico available :"+status4);//true
    }
}

class Person{
    String name;
    String country;

    Person(String name,String country){
        this.name=name;
        this.country=country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}