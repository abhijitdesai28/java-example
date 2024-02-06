package objectClass_equalsMethod;

public class Student
{
    int age;

    //constructor
    public Student(int age)
    {
        this.age=age;

    }
    public static void main(String[] args) {

        Student s1= new Student(20);
        Student s2= new Student(25);

        System.out.println(s1==s2);//false

        System.out.println(s1.equals(s2));//false


    }
}
