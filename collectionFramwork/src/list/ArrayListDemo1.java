package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        //declare arraylist
        ArrayList <Integer> ar=new ArrayList<Integer>();//ONLY accept Integer value

        ArrayList <String> ar1=new ArrayList<String>();//Only accept String value

        ArrayList al = new ArrayList();//accept all data type values

        //how to add individual value into arraylist
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('a');
        al.add(true);
        System.out.println(al);//it will print all list with inserted value-[100, welcome, 15.5, a, true]

        //find size of arraylist using size() method
        System.out.println(al.size());//5

        //remove values from arraylist using remove() method
        al.remove(2);//remove value from 2nd place ,here 2 is index and index start with 0
        System.out.println("after removing element :"+al);//[100, welcome, a, true]

        //inserting element using index() method
        al.add(2,"java");
        System.out.println("after insertion element :"+al);//[100, welcome, java, a, true]

        //how to read specific value-using get() method
        System.out.println(al.get(2));//java

        //changing the element using -set(index,value) method
        al.set(2,"c#");
        System.out.println(al);//[100, welcome, c#, a, true]

        //searching element in list using-contains() method
        System.out.println( al.contains("c#"));//true

        //check is list is empty or not using- isEmpty() method
        System.out.println(al.isEmpty());//FALSE

        //read all element from list using - For Loop
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        //read all element from list using -For Each Loop
        for(Object value:al)
        {
            System.out.println(value);
        }

        //read all element from list using-Iterator
        Iterator itr = al.iterator();//getting the iterator
        while(itr.hasNext())//check if iterator has the elements
        {
            System.out.println(itr.next());//printing the element and move to next

        }




    }
}
