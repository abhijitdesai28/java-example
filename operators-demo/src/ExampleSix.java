public class ExampleSix
{
    //in this pgm i, done all logical operator
    public static void main(String[] args)
    {
        int a=10, b=20;

        // && operator
        System.out.println((a > b) && (a > b));  //10>20  && 10>20 -false
        System.out.println((a > b) && (a < b));  // 10>20 &&  10<20 -false

        // || operator
        System.out.println((a < b) || (a > b));  //10<20 || 10>20 -true
        System.out.println((a > b) || (a < b));  // 10>20 || 10<20 -true
        System.out.println((a < b) || (a < b));  // 10<20 || 10<20 -true

        // ! operator
        System.out.println(!(a == b));  // true
        System.out.println(!(a > b));  // true


    }
}
