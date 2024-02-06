package objectClass_hashCodeMethod;

public class Employee
{
    @Override
    public int hashCode() {
        return 123456;//123456
    }

    public static void main(String[] args) {
        //create object
        Employee e= new Employee();
        //without overriding
        System.out.println(e.hashCode());//245257410
        //after overriding

    }
}
