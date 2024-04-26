package lab9;

import java.util.Arrays;
import java.util.List;

public class MultiplesSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 14, 21, 5, 10, 15);
        int sum = list.stream().filter(n -> n % 7 == 0).reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
