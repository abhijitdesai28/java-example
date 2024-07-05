package in.SpecialIterater;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sachin", "dhoni", "virat");
        Spliterator<String> spliterator = names.stream().spliterator();
        spliterator.forEachRemaining(n-> System.out.println(n));
    }
}
