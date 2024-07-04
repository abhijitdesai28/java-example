package in.StreamExample;

import java.util.Arrays;
import java.util.List;
//filter with map
//print name with its length and starting WITH "s"
public class ObjectFilter4 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Sandip", "Kulbhushan", "Chetan", "Shree", "Ram", "Munna", "Sagar");
        names.stream().filter(name-> name.startsWith("S")).map(name-> name +"-"+name.length()).
                forEach(name->System.out.println(name));


    }
}
