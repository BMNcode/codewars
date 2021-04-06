package resolveKata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BreakCamelCase {
    public static String camelCase(String input) {

        List<Character> src = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        for (Character ch : src) {
            if (Character.isUpperCase(ch)) {
                result.add(" ");
            }
            result.add(String.valueOf(ch));
        }

        return String.join("", result);

    }


    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
}
