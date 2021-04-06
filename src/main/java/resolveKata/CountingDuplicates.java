package resolveKata;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        return (int) text.chars()
                .boxed()
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(aLong -> aLong > 1)
                .count();



        // Write your code here
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("aA11"));
    }
}
