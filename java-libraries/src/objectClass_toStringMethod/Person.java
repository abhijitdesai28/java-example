package objectClass_toStringMethod;

public class Person
{
    String name="abhi";

    public static void main(String[] args){

        Person p= new Person();//object creation
        System.out.println(p);//objectClass.Person@e9e54c2
        System.out.println(p.name);//abhi

    }

}
