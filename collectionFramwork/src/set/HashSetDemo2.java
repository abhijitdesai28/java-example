package set;

import java.util.HashSet;

public class HashSetDemo2
{
    public static void main(String[] args) {
        //create hashset which accept only integer number
        HashSet<Integer> hs= new HashSet<Integer>();

        //add elements into the hashset
        hs.add(2);
        hs.add(4);
        hs.add(6);
        hs.add(8);
        hs.add(10);
        hs.add(12);
        hs.add(14);
        hs.add(16);
        hs.add(18);
       // hs.add("abhijit")//it will give u beautiful error
        System.out.println("elements in hashset :"+hs);//[16, 2, 18, 4, 6, 8, 10, 12, 14]

        //create new hashset and add all available hash set into new set
        HashSet new_hashSet=new HashSet();
        new_hashSet.addAll(hs);
        System.out.println("elements in new hashset :"+new_hashSet);//[16, 2, 18, 4, 6, 8, 10, 12, 14]

        //remove all elements from hashset using -removeAll() method
        System.out.println("hash before removing:"+new_hashSet);//[16, 2, 18, 4, 6, 8, 10, 12, 14]
        new_hashSet.removeAll(hs);
        System.out.println("hashset after removing all elements :"+new_hashSet);//[]


    }
}
