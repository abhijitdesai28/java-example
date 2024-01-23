public class MethodDemo
{
    void display()
    {
        System.out.println("hello world -method called");
    }
    public static void main(String [] args)
    {
        System.out.println("----------Start-----------------");
        MethodDemo md = new MethodDemo();//OBJECT CREATION
        md.display();//calling 0r invoking method with the help of object reference
        System.out.println("---------END-------------------");
    }
}
