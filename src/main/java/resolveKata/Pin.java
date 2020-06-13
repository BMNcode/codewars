package resolveKata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pin {
    public static boolean validatePin(String pin) {
        if(pin.length() != 4 && pin.length() != 6) return false;
        String pattern = "^\\d+$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(pin);
        return m.lookingAt();
    }
}
