package resolveKata;

public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder result = new StringBuilder();
        if(sentence.split(" ").length == 1) return result.append(sentence).reverse().toString();
        for(String s: sentence.split(" ")) {
            if(s.length() >= 5) {
                StringBuilder sb = new StringBuilder(s).reverse();
                result.append(sb);
            } else {
                result.append(s);
            }
            result.append(" ");
        }
        result.deleteCharAt(result.lastIndexOf(" "));
        return result.toString();
    }
}
