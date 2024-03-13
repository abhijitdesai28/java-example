package set;
import java.util.TreeSet;
public class TreeSetDemo1 {
    public static void main(String args[]){

        TreeSet <Integer>treeSetObject1 = new TreeSet<Integer>();

        TreeSet <String>treeSetObject2 = new TreeSet<String>();

        //boolean add(Object o)

        treeSetObject1.add(3);
        treeSetObject1.add(5);
        treeSetObject1.add(5);
        treeSetObject1.add(1);
        treeSetObject1.add(2);

        treeSetObject2.add("B");
        treeSetObject2.add("C");
        treeSetObject2.add("A");
        treeSetObject2.add("D");
        treeSetObject2.add("A");

        System.out.println("Values in TreeSet object 1: " +treeSetObject1);//Values in TreeSet object 1: [1, 2, 3, 5]

        System.out.println("Values in TreeSet object 2:  " +treeSetObject2);//Values in TreeSet object 2:  [A, B, C, D]

        //boolean addAll(Collection c)

        TreeSet <Integer>treeSetObject3 = new TreeSet<Integer>();

        TreeSet <Integer>treeSetObject4 = new TreeSet<Integer>();

        treeSetObject3.add(3);
        treeSetObject3.add(5);
        treeSetObject3.add(5);
        treeSetObject3.add(1);
        treeSetObject3.add(2);

        treeSetObject4.add(9);
        treeSetObject4.add(11);
        treeSetObject4.add(1);
        treeSetObject4.add(8);
        treeSetObject4.add(7);
        System.out.println("Values in TreeSet object 3 :"+treeSetObject3);
        System.out.println("Values in TreeSet object 4 :"+treeSetObject4);
        
        treeSetObject3.addAll(treeSetObject4);

        System.out.println("Values in TreeSet object 3: " +treeSetObject3);//[1, 2, 3, 5, 7, 8, 9, 11]

//        3. Object ceiling(Object o):
//        This method retrieves the least element which is greater than or equal to the given element in the argument list,
//        or null if there is no such element in the set
        System.out.println("Ceiling value of '5' is:" +treeSetObject3.ceiling(5));//5

        System.out.println("Ceiling value of '2' is:" +treeSetObject3.ceiling(4));//5

//        4. void clear():
//        This method removes all of the elements from this object
        System.out.println("Values in TreeSet object 1:" +treeSetObject1);//[1, 2, 3, 5]
        treeSetObject1.clear();
        System.out.println("Values in TreeSet object 1:" +treeSetObject1);//[]

//        5. Object clone():
//        This method returns a copy of set
        TreeSet <Integer>treeSetObject5 = new TreeSet<Integer>();

        TreeSet <Integer>treeSetObject6 = new TreeSet<Integer>();

        treeSetObject5.add(3);
        treeSetObject5.add(5);
        treeSetObject5.add(5);
        treeSetObject5.add(1);
        treeSetObject5.add(2);
        System.out.println("Values in TreeSet5:" +treeSetObject5);//[1, 2, 3, 5]
        treeSetObject6=(TreeSet<Integer>) treeSetObject5.clone();
        System.out.println("Values in Cloned TreeSet:" +treeSetObject6);//[1, 2, 3, 5]

//        7. boolean contains(Object o):
//        This method returns true if specified element is present in the given set,

        System.out.println("Checking if Tree Set Object contains element '0' : "

                +treeSetObject6.contains(0));//false

        System.out.println("Checking if Tree Set Object contains element '1' : "

                +treeSetObject6.contains(1));//true
    }
}
