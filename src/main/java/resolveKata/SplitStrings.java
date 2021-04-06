package resolveKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {
    public static String[] solution(String s) {
        List<String> strings = new ArrayList<>();
        char[] src = s.toCharArray();
        for(int i = 0; i < src.length; ) {
            int r = 2;
            StringBuilder sb = new StringBuilder();
            while (r > 0) {
                if (i == src.length - 1 && r == 2) {
                    sb.append(src[i]);
                    sb.append("_");
                    i++;
                    break;
                }
                sb.append(src[i]);
                i++;
                r--;
            }
            strings.add(sb.toString());
            sb = new StringBuilder();
        }

        return strings.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef")));
    }
}


