public class Example
{

    //method with argument and return statement
    int findSquare(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
        System.out.println("-----------START-------");
        Example e= new Example();//object creation
        int square = e.findSquare(5);//
        System.out.println("square of given number is :"+square);//25
        System.out.println("find square of :"+e.findSquare(8));//64
        System.out.println("Square of given number is :"+square);//25 :here we get 25 ,bcz we have not stored 8 into variable(square)

    }
}
