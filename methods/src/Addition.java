public class Addition
{

    //method with argument and without return statement
    void add(int a,int b)
    {
        System.out.println("sum of a :"+a+ ", and b :"+b+ " is :"+(a+b));
        /*int sum=a+b;
		System.out.println("Sum of "+a+" and  "+b+" is "+sum);
		System.out.println(a+b); */

    }
    public static void main(String[] args) {
        System.out.println("--------START--------");
        //Object Creation
        Addition a = new Addition();
        a.add(5,4);//method called or invoked
        a.add(10,5);//method called or invoked
        a.add(100,118);//method called or invoked
        System.out.println("--------END---------");
    }
}
