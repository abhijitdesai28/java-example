public class ExampleTwo
{
    public static void main(String[] args)
    {
        int a=10; int b=20;
        System.out.println(a + a++ + b + a);//10+10(11)+20+11=51

        System.out.println(a++ + b++ + a + b );//11(12)+20(21)+12+21 =64
    }
}
