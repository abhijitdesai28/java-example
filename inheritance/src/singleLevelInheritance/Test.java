package singleLevelInheritance;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("------main method start-------------------------------------------");
        //create object
        Son s= new Son();
        //with help child class of reference we can access properties of child as well
        //parent class
        System.out.println("child class properties :"+s.name);
        System.out.println("parent class properties with help of child class reference :"+s.age);

        System.out.println("------main method end-------------------------------------------");
    }
}
