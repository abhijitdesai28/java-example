public class StaticBlock
{
    static
    {
        System.out.println("in static block :1");
    }

    static
    {
        System.out.println("in static block :2");
    }

    public static void main(String[] args) {
        System.out.println("main method start");
        System.out.println("main method end");
    }

    static
    {
        System.out.println("in static block :3");
    }
}

/*

     OUTPUT:
        in static block :1
        in static block :2
        in static block :3
        main method start
        main method end

 */
