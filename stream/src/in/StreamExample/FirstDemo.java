package in.StreamExample;

import java.util.ArrayList;
import java.util.stream.Stream;
//java program to create Streams
public class FirstDemo {
    public static void main(String[] args){
        //Approach 1: we can create stream using - stream.of(e1,e2,e3,e4);  method
        Stream<Integer> stream1 =Stream.of(1,2,3,4);
        System.out.println(stream1);

        ArrayList<String> al= new ArrayList<>();
        al.add("shubham");
        al.add("abhi");
        al.add("rahul");
        al.add("chetan");

        //Approach 2: we can create stream using - stream()  method
        Stream<String> stream2 = al.stream();
        System.out.println(stream2);

    }
}
