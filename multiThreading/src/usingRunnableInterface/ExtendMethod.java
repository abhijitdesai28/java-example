package usingRunnableInterface;

class One implements Runnable
{

    @Override
    public void run() {
        for (int i=1;i<=4;i++)
        {
            System.out.println("\t from thread One :i="+i);
        }
        System.out.println("\t from thread One Exist");
    }
}

class Two implements Runnable
{
    @Override
    public void run()
    {
        for (int j=1;j<=4;j++)
        {
            System.out.println("\t from thread Two :j="+j);
        }
        System.out.println("\t from thread two exist");
    }
}

class Three implements Runnable{

    @Override
    public void run()
    {
        for (int k=1;k<=4;k++)
        {
            System.out.println("\t from thread three :k="+k);
        }
        System.out.println("\t from thread three exist");
    }
}
public class ExtendMethod
{
    public static void main(String[] args) {
        System.out.println("--------------welcome user---------------");
        //create objects of thread
        One one= new One();
        Thread thread1 = new Thread(one);
        Two two= new Two();
        Thread thread2 = new Thread(two);
        Three three = new Three();
        Thread thread3 = new Thread(three);

        //now start the thread using start() method
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
