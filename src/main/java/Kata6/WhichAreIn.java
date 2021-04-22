package Kata6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array2[i].contains(array1[j])) {
                    result.add(array1[j]);
                }
            }
        }
        return result.stream()
                .sorted()
                .distinct()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(inArray(
                new String[]{ "tarp", "mice", "bull" },
                new String[] { "lively", "alive", "harp", "sharp", "armstrong" })));
    }

}
