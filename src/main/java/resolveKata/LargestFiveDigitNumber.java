package resolveKata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        List<Integer> fiveDigit = new ArrayList<>();
        for(int i = 0; i < digits.length(); i++) {
            if(digits.length() < i + 5) break;
            fiveDigit.add(Integer.parseInt(digits.substring(i, i + 5)));
        }
        Collections.sort(fiveDigit);
        return fiveDigit.get(fiveDigit.size() - 1);
    }
}
