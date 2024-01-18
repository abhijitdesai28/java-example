package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1
{
    public static void main(String[] args) {
        //create hashset which accept all value
        HashSet hs= new HashSet();//default capacity 16 ,load factor-0.75

       // HashSet hs = new HashSet(100);//capacity 100, load factor-0.75

       // HashSet hs = new HashSet(10,(float)0.90);//capacity 100, load factor-0.75

      //  HashSet<Integer> hs = new HashSet<Integer>();//capacity 100, load factor-0.75

        //add element into hashset using -add() method
        hs.add(100);
        hs.add("welcome");
        hs.add(14.5);
        hs.add(true);
        hs.add(null);

        //print hashset- it does not contain insertion order
        System.out.println("element in hashset :"+hs);//[null, 100, welcome, 14.5, true]

        //print the size of the hashset using -size() method
        System.out.println("size of hashset :"+hs.size());//5

        //remove element from hashset
        System.out.println("before removing element in hashset :"+hs);//[null, 100, welcome, 14.5, true]
        hs.remove(14.5);
        System.out.println("hashset after removing 14.5 :"+hs);//[null, 100, welcome, true]

        //retrieving value/ object not possible to retrieve specific value using - get() method
        //System.out.println(hs.get()); -incorrect

        //change in current value is not possible using - set() method
       // System.out.println(hs.set(index,"x")); -incorrect

        //search element in hashset using -contains() method
        System.out.println("see if elements contains 'welcome' word :"+hs.contains("welcome"));//true

        //check if hashset is empty or not using - isEmpty()
        System.out.println("see if hashset is empty or not :"+hs.isEmpty());//false

        //reading elements from hashset using for loop is not possible //nn index so that's not possible
        /*for (int i=0;i<hs.size();i++)
        {
            System.out.println(hs.get(i));
        }*/

        //reading elements from hash set using for each loop
        System.out.println("reading elements from hashset using foreach loop :");
        for (Object o:hs)
        {
            System.out.print(o+" ");//null 100 welcome true
        }
        System.out.println("-----------------------------------------------------------");

        //reading elements from hashset using Iterator
        Iterator iterator= hs.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");//null 100 welcome true
        }


    }
}
