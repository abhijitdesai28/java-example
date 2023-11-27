public class ExampleFour
{

    public static void main(String[] args)
    {
        int a=10; int b=20; int c=5;
        a++; //10(11)
        ++a;//12
        c++;//5(6)
        ++b;//21
        System.out.println(++a + ++b + b+ c++ +a);//13+22+22+6(7)+13=76
        ++c;//8
        ++c;//9
        c++;//9(10)
        a++;//13(14)
        a++;//14(15)
        System.out.println(++a + ++b + c + c + ++c +a);//16+23+10+10+11+16=86

    }

}
