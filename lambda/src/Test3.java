
@FunctionalInterface
interface Taxi{
    public String bookTaxi(String source,String destination);
}

public class Test3 {
    public static void main(String[] args) {
        System.out.println("main method start");
        Taxi taxi=(String source,String destination)->{
            System.out.println("Taxi cab is booked from "+source+" to "+ destination);
            return ("price :5000");
                };
        taxi.bookTaxi("mumbai","pune");
        System.out.println("main method end");
    }
}
