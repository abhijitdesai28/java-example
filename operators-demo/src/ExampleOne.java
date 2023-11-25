public class ExampleOne
{
    public static void main(String[] args)
    {
        int a=10;
        a++;//10(11)
        a++;//11(12)
        a++;//12(13)
        System.out.println(a + a++);// 13 + 13(14)=26
        System.out.println(a++);//14(15)
    }
}
