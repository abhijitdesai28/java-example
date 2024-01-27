package usingThreadClass;

//declare one class

class One extends Thread
{
    @Override
    public void run()
    {
        System.out.println("i am from class one");
    }
}

public class ExtendMethod {
    public static void main(String[] args) {

        System.out.println("Welcome User :");
        System.out.println("We Need You");
        System.out.println("ok ,join us");
        One one = new One();
        one.start();
    }
}