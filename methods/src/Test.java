public class Test
{
    //method without argument and return statement
    //return type is decided based on the value

    int display()
    {
        return 10;//return type int
        //return 10.0//return type double

    }
    public static void main(String[] args) {
        System.out.println("----------START--------");
        Test t = new Test();//object creation
        int result = t.display();
        System.out.println("value present inside method :"+result);
        //System.out.println(t.display());
        System.out.println("---------END----------");
    }
}
