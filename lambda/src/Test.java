/***
 * this example is show how we can call method without lambda expression
 * without lambda we need one extra class which have method implementation
 * with lambda we can avoid writing one extra class
 */
@FunctionalInterface
interface Cab{
    public void bookCab();
}

class Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("Cab Booked");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("main method start");
        Cab  cab=new Ola();
        cab.bookCab();
        System.out.println("main method end");
    }
}
