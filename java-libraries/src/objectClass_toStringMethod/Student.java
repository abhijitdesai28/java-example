package objectClass_toStringMethod;

public class Student
{
    public static void main(String[] args) {
        //object creation
        Student s= new Student();
        //print
        System.out.println(s);//implicitly it calls toString() -> String Representation
        // objectClass.Student@e9e54c2

        System.out.println(s.toString());//explicitly calling toString()
        // objectClass.Student@e9e54c2
    }
}
