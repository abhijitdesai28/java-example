package classCastException;

public class Test
{
    public static void main(String[] args) {
        Son s= new Son();//son class object
        Daughter d= new Daughter();//daughter class object
        Father f= new Father();//father class object

      /*  f=s;//upcasting
        d=(Daughter) f;//this will produce error

        error-Exception in thread "main" java.lang.ClassCastException: class classCastException.Son cannot be cast to class classCastException.Daughter (classCastException.Son and classCastException.Daughter are in unnamed module of loader 'app')
        at classCastException.Test.main(Test.java:11)

       */

        System.out.println(s instanceof Son);//true
        System.out.println(s instanceof Father);//true

        System.out.println(d instanceof Daughter);//true
        System.out.println(d instanceof Father);//true

        System.out.println(f instanceof Father);//true
        System.out.println(f instanceof Son);//false
        System.out.println(f instanceof Daughter);//false

        System.out.println("-------------------------------");
        System.out.println(new Son() instanceof Father);//true
        System.out.println(new Father() instanceof Daughter);//false
        System.out.println(new Daughter() instanceof Daughter);//true








    }
}
