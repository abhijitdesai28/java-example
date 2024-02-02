public class User extends Car
{
    @Override
    void start() {
        System.out.println("Car started");

    }

//    @Override
//    void shiftGears() {
//        super.shiftGears();
//    }

    @Override
    void stop() {
        System.out.println("Car Stopped");

    }

    public static void main(String[] args) {
        User u = new User();
        u.start();
        u.shiftGears();
        u.stop();

    }
}
