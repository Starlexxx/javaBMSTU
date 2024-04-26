package lab9;

import java.util.Arrays;
import java.util.List;

public class StringEntriesCounter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "b", "c");
        String target = "a";
        long count = list.stream().filter(s -> s.equals(target)).count();
        System.out.println(count);
    }
}
