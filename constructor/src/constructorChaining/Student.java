package constructorChaining;

public class Student
{
    Student(int age)//16
    {
        this("abhijit");
        System.out.println("age: "+age);
    }
    Student(double height)//10.5
    {
        this(16);//it must be first executable statement
        System.out.println("height :"+height);
        //this(16); we cant use here
    }
    Student(String name)//abhijit
    {
        System.out.println("name :"+name);
    }

    public static void main(String[] args) {
        //create constructor
        Student s= new Student(10.5);

    }
}
