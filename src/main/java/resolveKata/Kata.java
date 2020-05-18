package resolveKata;

public class Kata {
    public static String getMiddle(String word) {
        String result = word;
        if(word.length() % 2 == 0) {
            return result = word.substring(word.length()/2 - 1, word.length()/2 + 1);
        } else {
            result = String.valueOf(word.charAt(word.length()/2));
        }
        return result;
    }
}
