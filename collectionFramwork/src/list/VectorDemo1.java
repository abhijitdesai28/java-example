package list;

import java.util.Vector;

public class VectorDemo1
{
    public static void main(String[] args) {

        //create vector list which accept only float numbers
        Vector<Float> v= new Vector<Float>();

        //add element in vector using - add() method
        v.add(5.4f);
        v.add(-4.5f);
        v.add(9.44f);
        v.add(6.3157f);
        //v.add(5) -here f indication is required or else you will get an error

        //print vector
        System.out.println("vector contain element :"+v);//[5.4, -4.5, 9.44, 6.3157]

        //adding element using -addElement() method
        v.addElement(8.5f);
        v.addElement(14.88f);
        System.out.println("after adding element using addElement() method :"+v);//[5.4, -4.5, 9.44, 6.3157, 8.5, 14.88]

        //remove element from vector using -remove method
        v.remove(8.5f);
        System.out.println("after removing 8.5f value :"+v);//[5.4, -4.5, 9.44, 6.3157, 14.88]

        //print size of vector using -size() method
        System.out.println("size of vector :"+v.size());//5

        //print capacity of vector
        System.out.println("capacity of vector :"+v.capacity());//10

        //print all vector using for each loop
        System.out.println("vector printed using -for each loop :");
        for (Float f:v)
        {
            System.out.println(f);
        }

    }
}
