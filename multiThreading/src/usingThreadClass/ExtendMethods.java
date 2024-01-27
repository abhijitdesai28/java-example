package usingThreadClass;

//declare class
class Superman extends Thread
{
    @Override
    public void run()
    {
       for(int i=1;i<=4;i++)
       {
           System.out.println("\t from thread superman :i ="+i);
       }
        System.out.println("\t from thread superman exist");
    }
}

class SpiderMan extends Thread
{
    @Override
    public void run()
    {
        for (int j=1;j<=4;j++)
        {
            System.out.println("\t from thread spiderman :j="+j);
        }
        System.out.println("\t from thread spiderman exist");
    }
}

class Batman extends Thread
{
    @Override
    public void run()
    {
        for (int k=1;k<=4;k++)
        {
            System.out.println("\t from thread Batman :k="+k);

        }
        System.out.println("\t from thread BatMan exist");
    }
}

public class ExtendMethods
{
    public static void main(String[] args) {
        System.out.println("-----------------welcome user :------------------------");
        //now create object of thread class
        Superman superman = new Superman();
        SpiderMan spiderMan = new SpiderMan();
        Batman batman= new Batman();

        //here we set maximum priority to superman, spider,batman class
        superman.setPriority(Thread.MAX_PRIORITY);
        spiderMan.setPriority(Thread.MIN_PRIORITY);
        batman.setPriority(Thread.NORM_PRIORITY);

        //now get the priority of class superman ,spiderman, batman
        System.out.println("priority of class superman :"+superman.getPriority());
        System.out.println("priority of class spiderman :"+spiderMan.getPriority());
        System.out.println("priority of class Batman :"+batman.getPriority());

        //now call the method
        superman.start();
        spiderMan.start();
        batman.start();

        System.out.println("-----------------end of process------------------------");
    }
}
