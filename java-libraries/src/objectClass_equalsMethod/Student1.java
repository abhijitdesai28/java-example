package objectClass_equalsMethod;

public class Student1
{
    int age;

    //constructor
    public Student1(int age)
    {
        this.age=age;

    }

    //override equals method to check content or compare
    public boolean equals(Object obj)
    {
       Student1 s=(Student1) obj;//dawn casting
        return  this.age==s.age;
    }
    public static void main(String[] args) {

        Student1 s1= new Student1(20);
        Student1 s2= new Student1(20);

        System.out.println(s1==s2);//false

        System.out.println(s1.equals(s2));//true bcz content are same


    }
}
