package set;

import java.util.HashSet;

public class HashSetDemo3
{
    public static void main(String[] args) {
        //crate hashset which accept only integer number
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);

        //print the hashSet
        System.out.println("hashSet contain integer number :"+hs);//[1, 2, 3, 4, 5, 6, 7, 8]

        //create new hashset and add previous hashset into new one
        HashSet new_hs= new HashSet();
        System.out.println("before adding old hashset :"+new_hs);//[]
        new_hs.add(3);
        new_hs.add(4);
        new_hs.add(5);

        System.out.println("after adding 3,4,5 into new hashset :"+new_hs);//[3, 4, 5]

        //Union
      //  new_hs.addAll(hs);//duplicate values not allowed
      //  System.out.println("after adding old hashset into current :"+new_hs);//[1, 2, 3, 4, 5, 6, 7, 8]

        //intersection
//        hs.retainAll(new_hs);
//        System.out.println("intersection is :"+hs);//[3, 4, 5]

        //difference
        hs.removeAll(new_hs);
        System.out.println("difference is :"+hs);//[1, 2, 6, 7, 8]

        //subset
        hs.containsAll(new_hs);
        System.out.println("subset :"+hs);//[1, 2, 6, 7, 8]
    }
}
