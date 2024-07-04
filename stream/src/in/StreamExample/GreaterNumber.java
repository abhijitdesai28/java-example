package in.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//write a java program to print greater number than 'N'
public class GreaterNumber {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(55, 68, 45, 52, 32, 22);
       /* old logic
       for(int i:list){
            if(i>32) {
                System.out.println(i);
            }
        }*/

      /* new logic
       Stream<Integer> stream = list.stream();
        Stream<Integer> filter = stream.filter(i -> i > 32);
        filter.forEach(i-> System.out.println(i));*/

        //above logic in less line
        list.stream().filter(i -> i>32).forEach(i-> System.out.println(i));
    }
}
