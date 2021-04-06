package resolveKata;

import java.util.ArrayList;
import java.util.List;

public class SimpleStringReversal {
    public static String solve(String s){
        StringBuilder sb = new StringBuilder();
        List<Integer> ints = new ArrayList<Integer>();
        char[] src = s.toCharArray();

        for (int i = 0; i < src.length; i++) {
            if (src[i] == ' ') {
                ints.add(i);
            } else {
                sb.append(src[i]);
            }
        }

        sb.reverse();

        for (int x = 0; x < ints.size(); x++) {
            sb.insert(ints.get(x), " ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("your code rocks"));
    }
}
