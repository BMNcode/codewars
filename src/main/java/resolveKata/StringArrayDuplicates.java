package resolveKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayDuplicates {

    public static String[] dup(String[] arr) {
        List<String> resT = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (s.length() >= 2) {
                char[] src = s.toCharArray();
                for (int i = 0; i < src.length - 1; i++) {
                    if (src[i] != src[i + 1]) {
                        sb.append(src[i]);
                    }
                }
                sb.append(src[src.length - 1]);
            }

            resT.add(sb.toString());
            sb = new StringBuilder();
        }

        String[] result = resT.toArray(new String[0]);

        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(dup(new String[]{"abracadabra", "allottee", "assessee"})));
    }
}
