package objectClass_toStringMethod;

public class Person2
{
    String name;
    int id;

    //create constructor
    public Person2(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    //override toString method
    @Override
    public String toString()
    {
        return "person id of "+name+" is:"+id;

    }
    public static void main(String[] args) {
        //object creation
        Person2 p2= new Person2("abhi",10);
        System.out.println(p2);//person id of abhi is:10
    }
}
