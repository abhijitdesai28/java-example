package constructorDemo;

public class Student
{
    int age;
    Student(int a)
    {
        age=a;

    }

    public static void main(String[] args) {
        Student s = new Student(21);
        Student s1= new Student(22);

        System.out.println("age :"+s.age); //age :21
        System.out.println("age :"+s1.age); //age :22
    }
}
