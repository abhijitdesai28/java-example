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

        System.out.println("Values in TreeSet object 3: " +treeSetObject3);
    }
}
