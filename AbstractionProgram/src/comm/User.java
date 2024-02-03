package comm;

public class User
{
    public static void main(String[] args) {
        System.out.println("-----main method start-----");
        Person p= new Employee();//superClassName ref= new ChildClassName();
        p.work();
        System.out.println("-----main method end-----");
    }
}
