package in.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorOperation {
    public static void main(String[] args){
        Person2 p1=new Person2("sagar","india");
        Person2 p2=new Person2("rok","uk");
        Person2 p3=new Person2("david","usa");
        Person2 p4=new Person2("kil","canda");
        Person2 p5=new Person2("kimjong","japan");

        List<Person2> person = Arrays.asList(p1, p2, p3, p4, p5);

        List<Person2> indians = person.stream().filter(c -> c.country.equals("india")).
                collect(Collectors.toList());

        indians.forEach(i->System.out.println(i));

        /*
       // collect names of persons who are belongs to india and store into  name collection
              List<String> names=  person.stream()
                        .filter(p-> p.country.equals("india"))
                        .map(p->p.name)
                        .collect(Collectors.toList());
        System.out.println(names);
        
         */
    }
}

class Person2{
    String name;
    String country;

    Person2(String name,String country){
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