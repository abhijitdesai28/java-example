public class Student
{
    static int age;

    static
    {
        System.out.println("initializing age to 10");
        age=10;
    }

    public static void main(String[] args) {
        System.out.println("age of student :"+Student.age);
    }

    static
    {
        System.out.println("initializing age to 20");
        age=20;
    }
}

/*
     OUTPUT:
        initializing age to 10
        initializing age to 20
        age of student :20
 */
