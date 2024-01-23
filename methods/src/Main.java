public class Main
{
    public static void main(String[] args) {
        System.out.println("-----------Start-------");
        //object creation
        Solutions s = new Solutions();
        s.m1();//method called or invoked

        System.out.println("-----------------");

        s.m2("abhijit",25);//method called or invoked

        System.out.println("-----------------");

        s.m3();//method called or invoked
        String godName = s.m3();
        System.out.println(godName);//jai hanuman
        System.out.println(s.m3());// jai hanuman

        System.out.println("------------------");

        int add = s.m4(10, 30);//method called or invoked
        System.out.println("addition of two number :"+add);
        System.out.println(s.m4(15,5));

        System.out.println("--------------END------------------");
    }
}