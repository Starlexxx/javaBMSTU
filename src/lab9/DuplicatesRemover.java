package lab9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesRemover {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "b", "c");
        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
    }
}