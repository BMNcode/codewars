package Kata8;

import java.util.Arrays;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int)Arrays.stream(arrayOfSheeps)
                .filter(s -> String.valueOf(s).equals("true"))
                .count();
        // TODO May the force be with you
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true, false};
        System.out.println(new CountingSheep().countSheeps(array1));
    }
}
