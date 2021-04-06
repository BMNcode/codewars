package resolveKata;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {

        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .collect(Collectors.toSet())
                .stream()
                .findFirst()
                .get();

    }

    public static void main(String[] args) {
        String s = "aaassss";
        System.out.println(s.contains("a"));
        System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }
}
