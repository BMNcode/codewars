package resolveKata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KataHighLow {
    public static String highAndLow(String numbers) {
        String[] numberStr = numbers.split(" ");
        List<Integer> list = new ArrayList<>();
        for(String s: numberStr) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        String max = String.valueOf(list.get(list.size() - 1));
        String min = String.valueOf(list.get(0));
        return max + " " + min;
    }
}
