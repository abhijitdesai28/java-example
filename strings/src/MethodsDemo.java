public class MethodsDemo
{
    public static void main(String[] args) {
        //create string literal and give some data
        String s="java developer";
        System.out.println(s);//java developer

        System.out.println("------------------------");

        System.out.println(s.length());//14

        System.out.println("------------------------");

        System.out.println(s.toUpperCase());//JAVA DEVELOPER

        System.out.println("------------------------");

        System.out.println(s.toLowerCase());//java developer

        System.out.println("------------------------");

        System.out.println(s.startsWith("java"));//true
        System.out.println(s.startsWith("Java"));//false

        System.out.println("------------------------");

        System.out.println(s.endsWith("er"));//true
        System.out.println(s.endsWith("Eloper"));//false

        System.out.println("------------------------");

        System.out.println(s.contains("dev"));//true
        System.out.println(s.contains("Dev"));//false

        System.out.println("------------------------");

        System.out.println(s.concat(" in xyz company"));//java developerin xyz company

        System.out.println("------------------------");

        System.out.println(s.charAt(4));
        System.out.println(s.charAt(10));//o

        System.out.println("------------------------");

        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('D'));//ifstring not contain value it will give -1
        System.out.println(s.indexOf('x'));//-1
        System.out.println(s.indexOf('e'));//6

        System.out.println("------------------------");

        String a="java";
        String b="Java";
        String c="java";

        System.out.println(a.equals(b));//false
        System.out.println(a.equals(c));//true

        System.out.println(a.equalsIgnoreCase(b));//true

        System.out.println("------------------------");

        String x="hello sethupati";

        System.out.println(x.substring(2));//llo sethupati
        System.out.println(x.substring(5));// sethupati

        System.out.println(x.substring(4,8));//o se
        System.out.println(x.substring(4,7));//o s

        System.out.println("------------------------");

    }
}
