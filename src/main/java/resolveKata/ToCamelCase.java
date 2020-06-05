package resolveKata;

import java.util.ArrayList;
import java.util.List;

public class ToCamelCase {
    public static String toCamelCase(String s) {
        char[] charS = s.toCharArray();
        List<Integer> upperIndex = new ArrayList<Integer>();

        for(int i = 0; i < charS.length; i++) {
            if(charS[i] == '-' || charS[i] == '_') {
                charS[i+1] = Character.toUpperCase(charS[i+1]);
                charS[i] = ' ';
            }
        }
        return String.copyValueOf(charS).replace(" ", "");
    }
}
