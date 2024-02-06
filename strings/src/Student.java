public class Student
{
    public static void main(String[] args) {
        //create object of string
        Student s= new Student();

        System.out.println(s);//here implicitly calls  toString() method
        System.out.println(s.toString());//here explicitly calling toString() method
        //output of above to print statement
        //Student@58372a00
        //Student@58372a00

        System.out.println("------------------------------------------");

        Student std =new Student();
        System.out.println(std.hashCode());//81628611

        System.out.println("--------------------------");
        Student s1= new Student();
        Student s2= new Student();

        System.out.println(s1.equals(s2));//here it check address- false
    }
}
