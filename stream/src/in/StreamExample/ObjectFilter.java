package in.StreamExample;

import java.util.stream.Stream;
//Write a java program to filter data whose age>=18
public class ObjectFilter {
    public static void main(String[] args){
        User u1=new User("abhi",55);
        User u2=new User("ram",16);
        User u3=new User("prakash",33);
        User u4=new User("soma",10);
        User u5=new User("harshad",65);
        User u6=new User("akash",26);
        User u7=new User("chetan",47);

        //now create list of above object
        Stream<User> stream = Stream.of(u1, u2, u3, u4, u5, u6, u7);

        stream.filter(u->u.age>=18).forEach(u->System.out.println(u));



    }
}

class User{
    String name;
    int age;

    User(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
