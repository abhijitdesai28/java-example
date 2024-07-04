package in.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchOperation2 {
    public static void main(String[] args){
        Person1 p1=new Person1("sagar","india");
        Person1 p2=new Person1("rok","uk");
        Person1 p3=new Person1("david","usa");
        Person1 p4=new Person1("kil","canda");
        Person1 p5=new Person1("kimjong","japan");

        List<Person1> person = Arrays.asList(p1, p2, p3, p4, p5);

        Optional<Person1> findFirst = person.stream().filter(c -> c.country.equals("india"))
                .findAny();

        if(findFirst.isPresent()){
            System.out.println(findFirst.get());
        }
    }
}

class Person1{
    String name;
    String country;

    Person1(String name,String country){
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