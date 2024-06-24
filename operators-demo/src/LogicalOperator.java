public class LogicalOperator {
    public static void main(String[] args){

        int a=10, b=20, c=5;
        a= a + (++b + c++ );//10+ 21+5(6)=36
        b=a+b+c;//36+21+6=63

        boolean res1=(!(a>=b));// (!(36>=63))  true
        boolean res2=(a+b)!= (a-b)); // (36+63) != (36-63) true

        System.out.println(res1 && res2); //true
        System.out.println(!(res1 || res2));//false

    }
}