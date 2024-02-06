package objectClass_toStringMethod;

public class Student3
{
    String name;

    public Student3(String name) {
       this.name= name;
    }


    public String toString()
    {
        return name;
    }
    public static void main(String[] args) {
        //object creation
        Student3 s= new Student3("abhi");
        //print
        System.out.println(s);//implicitly it calls toString() -> String Representation
        // abhi

        Student3 s1=new Student3("sonu");

        System.out.println(s1.toString());//explicitly calling toString()
        // sonu
    }
}
