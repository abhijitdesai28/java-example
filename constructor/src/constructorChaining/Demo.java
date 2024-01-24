package constructorChaining;

public class Demo
{
    Demo(int a)
    {
        System.out.println(1);
    }
    Demo()
    {
        this(10);
        System.out.println(2);
    }

    public static void main(String[] args) {
        System.out.println("start-------");
        //create object
        Demo d= new Demo();

        System.out.println("end----------");
    }
}
