package in.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NamesStartWith {
    public static void main(String [] args){
       // List<String> array=Arrays.asList("rom","lila","robert","david","all");

        ArrayList<String> al=new ArrayList<>();
        al.add("shubham");
        al.add("abhi");
        al.add("rahul");
        al.add("chetan");
        al.add("akash");
        System.out.println(al);//[shubham, abhi, rahul, chetan]

        Stream<String> stream = al.stream();
        Stream<String> filter = stream.filter(i -> i.startsWith("a"));
        filter.forEach(i->System.out.println(i));

        //al.stream().filter(i-> i.startsWith("a")).forEach(i->System.out.println(i));
    }
}
