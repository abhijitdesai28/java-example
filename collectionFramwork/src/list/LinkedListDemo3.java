package list;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo3
{
    public static void main(String[] args) {
        //create LinkedList
        LinkedList l= new LinkedList();

        //add element in list using - add() method
        l.add("dog");
        l.add("cat");
        l.add("mouse");
        l.add("horse");
        l.add("cat");

        //print element in the list
        System.out.println("added element in list :"+l);//[dog, cat, mouse, horse, cat]

        //add new element in first number using - addFirst() method
        l.addFirst("tiger");
        System.out.println("after adding first element :"+l);//[tiger, dog, cat, mouse, horse, cat]

        //add new element in last number using - addLast() method
        l.addLast("lion");
        System.out.println("after adding last element :"+l);//[tiger, dog, cat, mouse, horse, cat, lion]

        //get first element from list using -getFirst() method
        System.out.println("first element from list :"+l.getFirst());//tiger

        //get last element from list using -getLast() method
        System.out.println("Last element from list :"+l.getLast());//lion

        //remove first element from list
        l.removeFirst();
        System.out.println("list after removing first element :"+l);//[dog, cat, mouse, horse, cat, lion]

        //remove first element from list
        l.removeLast();
        System.out.println("list after removing last element :"+l);//[dog, cat, mouse, horse, cat]

        //get the size of the element using- size() method
        System.out.println("size of the list :"+l.size());//5

        //create an array of String type
        String[] str={"abhijit","pradip","soniya","vidya","durga","rupali"};

        //print string array
        System.out.println("element from string :"+ Arrays.toString(str));//one way of printing
        //[abhijit, pradip, soniya, vidya, durga, rupali]

        //print using for each loop
        System.out.println("element from list using for each loop :");
        for (String s:str)
        {
            System.out.println(s);
        }
        
    }
}
