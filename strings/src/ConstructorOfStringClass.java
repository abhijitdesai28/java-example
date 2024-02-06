public class ConstructorOfStringClass
{
    public static void main(String[] args)
    {
        //this is the example of string class constructors

        //empty representation of a string object
        String s1= new String();
        System.out.println(s1);//here it give empty output

        System.out.println("------------------");

        //passing a string object
        String s2= new String("dinga");
        System.out.println(s2);//dinga

        System.out.println("-------------------");

        char [] c={'j','a','v','a'};
        //converting character array into string
        String s3= new String(c);
        System.out.println(s3);//java
    }
}
