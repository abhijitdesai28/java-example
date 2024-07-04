package in.StreamExample;

import java.util.Arrays;
import java.util.stream.Stream;

//Write a java pgm whose name start with 'A' and age is >=18
public class ObjectFilter2 {
    public static void main(String[] args){
        User1 u1=new User1("Rakesh",45);
        User1 u2=new User1("Somnath",15);
        User1 u3=new User1("Abhijit",18);
        User1 u4=new User1("Pradip",55);
        User1 u5=new User1("Chetan",89);
        User1 u6=new User1("Arshad",75);

        Stream<User1> stream = Stream.of(u1, u2, u3, u4, u5, u6);
        stream.filter(u-> u.age>=18 && u.name.startsWith("A")).forEach(u->System.out.println(u));

      /*  simplified logic of above code
      stream.filter(u->u.age>=15).
                filter(u->u.name.startsWith("A")).
                    forEach(u->System.out.println(u));

       */
    }
}

class User1{
    String name;
    int age;

    User1(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
