package resolveKata;

public class Accumul {
    public static String accum(String s) {
        char[] sToChar = s.toCharArray();
        String firstChar;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sToChar.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(j == 0) {
                    firstChar = String.valueOf(sToChar[i]).toUpperCase();
                    result.append(firstChar);
                } else {
                    result.append(String.valueOf(sToChar[i]).toLowerCase());
                }
            }
            result.append("-");
        }
        result.deleteCharAt(result.lastIndexOf("-"));
        return result.toString();
    }
}
