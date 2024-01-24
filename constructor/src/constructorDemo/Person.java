package constructorDemo;

public class Person
{
    int age;
    String name;

    Person(int age,String name)
    {
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Person p = new Person(10,"abhijit");

        System.out.println("age :"+p.age +" and name :"+p.name);//age :10 and name :abhijit

        Person p1= new Person(21,"tom");
        System.out.println("age :"+p1.age+ " and name :"+ p1.name);//age :21 and name :tom

    }
}
