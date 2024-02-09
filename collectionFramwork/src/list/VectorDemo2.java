package list;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo2
{
    public static void main(String [] args)
    {
        //create one vector which accept only integer value
        Vector <Integer> vectorObject =new Vector<Integer>(10);
        //now add 10 value in vector using add() method
        vectorObject.add(3);
        vectorObject.add(7);
        vectorObject.add(6);
        vectorObject.add(8);
        vectorObject.add(3);
        vectorObject.add(4);
        vectorObject.add(4);
        vectorObject.add(10);
        vectorObject.add(77);
        vectorObject.add(22);
        //vectorObject.add(11);  after specified lenth also it takes value bcz Collection framework growable in nature
       // vectorObject.add(15);
        //now print value from vector
        System.out.println(vectorObject);//[3, 7, 6, 8, 3, 4, 4, 10, 77, 22]

        System.out.println("----------------------------------------------------------------------------------------");





        //now add element in vector using add(int index,E element)
        Vector<Integer> vectorObject1 = new Vector<Integer>(5);
        //add element in vector using add(int index,E element) method
        vectorObject1.add(0,14);
        vectorObject1.add(1,15);
        vectorObject1.add(2,60);
        vectorObject1.add(3,65);
        vectorObject1.add(4,55);
        //print element from vector using sout
        System.out.println("element in vector using sout :"+ vectorObject1);//[14, 15, 60, 65, 55]
        //print vector element using for each loop
        System.out.println("element in vector using for each loop:");
        for (Integer integer:vectorObject1)
        {
            System.out.println(integer);
        }

        //add element at index 4
        vectorObject1.add(4,00);
        System.out.println(vectorObject1);//[14, 15, 60, 65, 0, 55]

        //add element in vector using addElement() method
        vectorObject1.addElement(5);
        System.out.println(vectorObject1);//[14, 15, 60, 65, 0, 55, 5]

        System.out.println("----------------------------------------------------------------------------------------");
         //check the capacity of vector
        System.out.println(vectorObject1.capacity());//10
        System.out.println(vectorObject.capacity());//10

        System.out.println("----------------------------------------------------------------------------------------");
        //clear all vector element
        System.out.println("before clear vector element :"+vectorObject1);//[14, 15, 60, 65, 0, 55, 5]
        vectorObject1.clear();
        System.out.println("after clearing the vector :"+vectorObject1);//[]

        System.out.println("----------------------------------------------------------------------------------------");
        //copy all element of vectorObject from vectorObject1
        System.out.println("vector element from present vector :"+vectorObject);//[3, 7, 6, 8, 3, 4, 4, 10, 77, 22]

        vectorObject1 = (Vector<Integer>) vectorObject.clone();
        System.out.println("after copied :"+vectorObject1);//[3, 7, 6, 8, 3, 4, 4, 10, 77, 22]

        System.out.println("----------------------------------------------------------------------------------------");
        //check if element is present or not in vector
        System.out.println(vectorObject1.contains(4));//true

        System.out.println("----------------------------------------------------------------------------------------");
        //check if element of vectorObject to vectorObject1 are same or not
        System.out.println(vectorObject1.containsAll(vectorObject));//true

        System.out.println("----------------------------------------------------------------------------------------");
        //void copyInto(Object anArray)
        //copy vector element into array
        Integer [] integers={11,12,13,14,07,44,45,66,45,78};
        System.out.println("element in array :"+ Arrays.toString(integers));//[11, 12, 13, 14, 7, 44, 45, 66, 45, 78]
        System.out.println("element in vector:"+vectorObject1);//[3, 7, 6, 8, 3, 4, 4, 10, 77, 22]
//        integers.wait(vectorObject1);
//        System.out.println(vectorObject1);
        vectorObject1.copyInto(integers);
        System.out.println("element in array :" +Arrays.toString(integers));//[3, 7, 6, 8, 3, 4, 4, 10, 77, 22]

        System.out.println("----------------------------------------------------------------------------------------");
        //Object elementAt(int index)
        //check element at specific position
        System.out.println("element at position two :"+vectorObject1.elementAt(2));//6

        System.out.println("-----------------------------------------------------------------------------");
        // boolean equals(Object o)
        System.out.println(vectorObject1.equals(integers));//false

        Vector <Integer> vectorObjectOne = new Vector<Integer>(5);
        vectorObjectOne.add(3);
        vectorObjectOne.add(4);
        vectorObjectOne.add(5);
        vectorObjectOne.add(6);
        vectorObjectOne.add(7);
        Vector <Integer> vectorObjectTwo = new Vector<Integer>(5);
        vectorObjectTwo.add(3);
        vectorObjectTwo.add(4);
        vectorObjectTwo.add(5);
        vectorObjectTwo.add(6);
        vectorObjectTwo.add(7);
        System.out.println(vectorObjectOne.equals(vectorObjectTwo));//true

        System.out.println("----------------------------------------------------------------------------------------");
        //Object firstElement()
        System.out.println("element inside vector :"+vectorObjectOne);
        System.out.println("first element in vector is :"+vectorObjectOne.firstElement());//3

        System.out.println("----------------------------------------------------------------------------------------");
        //Object get(int index)
        System.out.println("value at index 3 :"+vectorObjectOne.get(3));//6

        System.out.println("----------------------------------------------------------------------------------------");
        //int hashCode()
        System.out.println("hashcode of vector :"+vectorObjectOne.hashCode());//31523876

        System.out.println("-----------------------------------------------------------------------------");
        //int indexOf(Object o)
        System.out.println("index of element 5 :"+vectorObjectOne.indexOf(5));//2

        System.out.println("----------------------------------------------------------------------------------------");
        //int indexOf(Object o, int index)
        Vector <Integer> newVector  = new Vector<Integer>(8);
        newVector.add(10);
        newVector.add(50);
        newVector.add(10);
        newVector.add(60);
        newVector.add(10);
        newVector.add(50);
        newVector.add(80);
        newVector.add(600);
        System.out.println(newVector.indexOf(10,3));//4

        System.out.println("----------------------------------------------------------------------------------------");
        //void insertElementAt(Object o, int index)
        newVector.insertElementAt(500,2);
        System.out.println("inserted element at index 2 :"+newVector);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("check vector is empty or not :"+newVector.isEmpty());//false
        newVector.clear();
        System.out.println("check vector is empty or not :"+newVector.isEmpty());//true

        System.out.println("-----------------------------------------------------------------------------");
        //Object lastElement()
        newVector.add(500);
        newVector.add(600);
        newVector.add(700);
        newVector.add(800);
        newVector.add(900);
        newVector.add(100);
        newVector.add(200);
        System.out.println("last element is :"+newVector.lastElement());//200

        System.out.println("----------------------------------------------------------------------------------------");
        newVector.add(100);
        newVector.add(200);
        newVector.add(300);
        newVector.add(400);
        newVector.add(500);
        newVector.add(700);
        newVector.add(800);
        newVector.add(900);
        newVector.add(100);
        System.out.println("element is vector :"+newVector);//[500, 600, 700, 800, 900, 100, 200, 100, 200, 300, 400, 500, 700, 800, 900, 100]
        System.out.println("last occurrence of element 100 is :"+newVector.lastIndexOf(100));//15
        System.out.println("last occurrence of element 200 is :"+newVector.lastIndexOf(200));//8

        System.out.println("----------------------------------------------------------------------------------------");
        //Object remove(int index)
        System.out.println("before removing :"+newVector);//[500, 600, 700, 800, 900, 100, 200, 100, 200, 300, 400, 500, 700, 800, 900, 100]
        System.out.println("remove element from vector index 1:"+newVector.remove(1));//[500, 700, 800, 900, 100, 200, 100, 200, 300, 400, 500, 700, 800, 900, 100]
        System.out.println("after removing :"+newVector);

        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("-----------------------------------------------------------------------------");







    }
}
