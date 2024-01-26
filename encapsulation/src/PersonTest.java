public class PersonTest
{
    public static void main(String[] args) {
        //create object of person class
        Person p = new Person();
        p.setAge(20);
        System.out.println("Person age :"+p.getAge());
        System.out.println("------------------------");

        //another way for above execution
        int age = p.getAge();
        System.out.println("age:  "+age);
    }
}
