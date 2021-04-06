package resolveKata;

import java.util.Map;
import java.util.TreeMap;

public class Order {
    public static String order(String words) {

        Map<Integer, String> maps = new TreeMap<>();

        String[] arr = words.split(" ");
        for (String s : arr) {
            char[] chars = s.toCharArray();
            int n = 0;
            for (char aChar : chars) {
                if (Character.isDigit(aChar)) {
                    n = aChar;
                }
            }
            maps.put(n, s);
        }

        return String.join(" ", maps.values());

    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
