package list;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2
{
    public static void main(String[] args) {
        //declare linked list
        LinkedList l= new LinkedList();

        //ADD ELEMENT IN LIST
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println("added element :"+l);//[X, Y, Z, A, B, C]

        //add current list in new created list
        LinkedList l_dup=new  LinkedList();
        l_dup.addAll(l);
        System.out.println("new list :"+l_dup);//[X, Y, Z, A, B, C]

        //remove all element from new list using -remove() method
        l_dup.removeAll(l);
        System.out.println("after removing element from list :"+l_dup);//[]

        //sort all list using sort method
        System.out.println("before sort list :"+l);//[X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("list after sorting ;"+l);//[A, B, C, X, Y, Z]

        //reverse list using -Collections class -reverse() method
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("after reverse list :"+l);//[Z, Y, X, C, B, A]

        //shuffle element from list
        System.out.println("element in the list before shuffled :"+l);//[Z, Y, X, C, B, A]
        Collections.shuffle(l);
        System.out.println("element in the list after shuffled :"+l);//[Y, B, C, A, Z, X]

    }
}
