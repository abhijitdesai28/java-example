package objectClass_toStringMethod;

public class Student1
{
    public String toString()
    {
        return "hi namaste";
    }
    public static void main(String[] args) {
        //object creation
        Student1 s= new Student1();
        //print
        System.out.println(s);//implicitly it calls toString() -> String Representation
        // hi namaste

        System.out.println(s.toString());//explicitly calling toString()
        // hi namaste
    }
}
