package objectClass_toStringMethod;

public class Person1
{
    String name;//non- static global variable

    public Person1( String name)
    {
        this.name=name;
    }

    public static void main(String[] args)
    {
        Person1 p1= new Person1("abhijit");//object creation
        System.out.println(p1);//objectClass.Person1@e9e54c2


    }
}
