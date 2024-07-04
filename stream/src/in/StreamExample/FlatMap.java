package in.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args){
        List<String> javaCourses = Arrays.asList("core java", "adv java", "Spring Boot");
        List<String> uiCourses = Arrays.asList("HTML", "CSS", "JS");

        List<List<String>> courses = Arrays.asList(javaCourses, uiCourses);

        //courses.stream().forEach(c->System.out.println(c));

        Stream<String> fms = courses.stream().flatMap(s -> s.stream());
        fms.forEach(c->System.out.println(c));
    }
}
