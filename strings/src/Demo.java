public class Demo
{
    public static void main(String[] args) {
        //create string using java literal
        //String s="java";
        //System.out.println(s);//java

        System.out.println("---------------------------------------");
        //create string using new keyword
        String s= new String("java");
        System.out.println(s);//java   :here implicitly calls toString() method of object class

        System.out.println(s.toString());//java  :here explicitly calls toStrings method of objct class

        System.out.println("---------------------------------------");

        String s1 =new String("A");
        System.out.println(s1.hashCode());//65

        System.out.println("----------------------------------------");

        String a= new String("ramesh");
        String b= new String("ramesh");

        System.out.println(a.equals(b));//true  : bcz here implicitly called equals method and it compares content instead of address



    }
}
