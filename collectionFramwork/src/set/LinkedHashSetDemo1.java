package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1
{
    public static void main(String[] args) {
        //create linkedHashSet which accept only integer value
        LinkedHashSet lset=new LinkedHashSet();

        //create general linkedHashset which accept all value
        LinkedHashSet new_lset=new LinkedHashSet();

        //add elements into the linkedhashset
        new_lset.add(100);
        new_lset.add(15.4);
        new_lset.add("abhijit");
        new_lset.add(true);
        new_lset.add(null);

        //print linkedhashset
        System.out.println("element present in linkedHashSet :"+new_lset);//[100, 15.4, abhijit, true, null]
    }
}
