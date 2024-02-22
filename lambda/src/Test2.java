
@FunctionalInterface
interface Bike{
    public void bookBike(String source,String destination);
}
//class Uber implements Bike{
//    @Override
//    public void bookBike() {
//        System.out.println("bike booked....");
//    }
//}
public class Test2 {
    public static void main(String[] args) {
        System.out.println("main method start");
        Bike bike=(String source,String destination)-> System.out.println("bike booked enjoy from :"+source +" to "+destination);
        //above line in less code see below
        Bike bike1=(source,destination)-> System.out.println("bike booked enjoy from :"+source +" to "+destination);
        bike.bookBike("mumbai","pune");
        bike1.bookBike("pune","mumbai");
        System.out.println("main method end");
    }
}
