
@FunctionalInterface
interface Car{
    public void bookCab();
}
public class Test1 {
    public static void main(String[] args) {
        System.out.println("main method start");
        //now create lambda expression
        Car car=() -> System.out.println("car is booked..");
        car.bookCab();
        System.out.println("main method end");
    }
}
