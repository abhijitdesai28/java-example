package in.StreamExample;

import java.util.Arrays;
import java.util.List;

public class SliceOperation {
    public static void main(String[] args){
        List<String> javaCourses = Arrays.asList("corejava", "advjava", "springboot", "restapi");

       // limit(long maxSize) :get list elements from the stream based on given size
        javaCourses.stream().limit(3).forEach(c->System.out.println(c));
        System.out.println("--------------------------------------------------------------");

       // skip(long n) :it is used to skip given number of elements from starting position of the stream
        javaCourses.stream().skip(2).forEach(c->System.out.println(c));
        System.out.println("--------------------------------------------------------------");


       // distinct() :to get unique elements from the stream
        List<String> name = Arrays.asList("raja", "rani", "golu", "raja", "rani");
        name.stream().distinct().forEach(c->System.out.println(c));

    }
}
