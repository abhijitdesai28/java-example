public class IncrementOperator3
{
    public static void main(String[] args)
    {
        int a=10 , b=20 ,c=5;

        a++;//10(11)
        ++b;//21
        ++c;//6
        a++;//11(12)
        --a;//11
        ++b;//22
        ++a;//12
        System.out.println(++a + ++b + --b + --c + a);// 13+ 23+ 22+ 5+ 13=76
        a=a+b;//13+22=35
        --a;//34
        b++;//22(23)
        ++c;//6
        c=a+b;//34+23=57
        System.out.println(++a + ++b + ++c + c-- + ++c + ++a);//35+ 24 + 58(59)+ 58 + 58 + 36 =269
    }
}