import java.sql.SQLOutput;

public class NonStaticBlock
{

    {
        System.out.println("in non-static block:1");
    }

    {
        System.out.println("in non-static block :2");
    }

    public static void main(String[] args) {
        System.out.println("main method start");
        NonStaticBlock nsb= new NonStaticBlock();
        System.out.println("main method end ");
    }

    {
        System.out.println("in non-static block :3");
    }
}

/*
       OUTPUT:
        main method start
        in non-static block:1
        in non-static block :2
        in non-static block :3
        main method end

 */
