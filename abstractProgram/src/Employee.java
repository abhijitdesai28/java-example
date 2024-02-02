public class Employee extends Person
{
    @Override
    void work() {
        System.out.println("Working");
    }

    public static void main(String[] args) {
        System.out.println("----main method start----");
        Employee e = new Employee();
        e.work();
        System.out.println("----main method end----");
    }
}
