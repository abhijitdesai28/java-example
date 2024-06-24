public class RelationalOperator {
    public static void main(String[] args){

        int a=10, b=20, c=5;
        ++a;//11
        --b;//19
        c++;//5(6)
        a=a+b;// 11+19=30

        System.out.println(!(++a + b) > = (b-- + c++));// 31+19 >= 19(18)+6(7)
                                                       //  ! (50  >= 25)
                                                       //  false
        a=a+b;// 31 + 18 =49
        b=a+b;// 49 + 18 =67
        System.out.println(a==b);// 49 == 67 false
    }
}