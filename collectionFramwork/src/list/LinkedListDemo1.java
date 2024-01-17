package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1
{
    public static void main(String[] args)
    {
        //declare LinkedList
       // LinkedList<Integer> l=new LinkedList<Integer>();//THIS LIST ONLY ACCEPT INTEGER VALUE
      //  LinkedList<String> sl=new LinkedList<String>();//this list accept only string value
      //  List l1=new LinkedList();

        LinkedList l= new LinkedList<>();//accept all types of data
        l.add(100);
        l.add("wecome");
        l.add("15.5");
        l.add("a");
        l.add(true);
        System.out.println(l);//[100, wecome, 15.5, a, true]

        //find size of arraylist using size() method
        System.out.println(l.size());//5

        //remove element using- remove() method
        l.remove(1);
        System.out.println("after removing 1 element from list :"+l);//[100, 15.5, a, true]

        //insert new element using -all(index,value) method
        l.add(2,"python");
        System.out.println("after inserting element :"+l);//[100, 15.5, python, a, true]

        //retrieve specific element using -get() method
        System.out.println(l.get(2));//python

        //change element using -set() method
        l.set(2,"c#");
        System.out.println("after replace :"+l);//[100, 15.5, c#, a, true]

        //search element using -contains() method it will return true /false
        System.out.println(l.contains("c#"));//true
        System.out.println(l.contains("c++"));//false

        //see if list is empty or not
        System.out.println(l.isEmpty());//false

        //print element using -for loop
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        //print element using -for each loop
        for (Object value:l)
        {
            System.out.println(value);
        }

        //fprint element using Iterator
        Iterator itr=l.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }








    }
}
