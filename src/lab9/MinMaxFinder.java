package lab9;

import java.util.Arrays;
import java.util.List;

public class MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 14, 21, 5, 10, 15);

        list.stream().reduce(Integer::max)
            .ifPresent(max -> System.out.println("Max: " + max));

        list.stream().reduce(Integer::min)
            .ifPresent(min -> System.out.println("Min: " + min));
    }
}