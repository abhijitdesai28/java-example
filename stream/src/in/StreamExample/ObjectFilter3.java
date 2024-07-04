package in.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

//write a pgm which convert all cities into uppercase and give us(transformed)
public class ObjectFilter3 {
    public static void main(String[] args){

        List<String> names = Arrays.asList("india", "usa", "uk", "japan", "china");

        /* legacy logic:
        for(String name:names){

            System.out.println(name.toUpperCase());
        }
        */
        names.stream().map(name -> name.toUpperCase()).forEach(name->System.out.println(name));

        System.out.println("=======================================");

        //write a logic to get length of each country
        names.stream().mapToInt(name-> name.length()).forEach(name->System.out.println(name));
    }
}
