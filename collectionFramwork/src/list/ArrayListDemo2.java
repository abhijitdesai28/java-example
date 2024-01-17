package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2
{
    public static void main(String[] args)
    {
        //crate array list
        ArrayList al= new ArrayList();//accept all the data types
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");
        System.out.println(al);//[X, Y, Z, A, B, C]

        //add element of an array list to another arraylist using - addAll()
        ArrayList al_dup= new ArrayList();
        al_dup.addAll(al);
        System.out.println("here added all element from previous list al to al_dup :"+al_dup);//[X, Y, Z, A, B, C]

        //remove group of elements from the list using -removeAll()
        al_dup.removeAll(al);
        System.out.println("after removing group of element from al_dup :"+al_dup);//[]

        //sort list using -sort() method
        System.out.println("before sort list :"+al);//[X, Y, Z, A, B, C]
        Collections.sort(al);
        System.out.println("after sort list :"+al);//[A, B, C, X, Y, Z]

        //sorting reverse order
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("reverse order :"+al);//[Z, Y, X, C, B, A]

        //shuffle list using - shuffle method
        System.out.println("before shuffle :"+al);//[Z, Y, X, C, B, A]
        Collections.shuffle(al);
        System.out.println("After shuffling :"+al);//[C, B, Y, X, Z, A]



    }
}
