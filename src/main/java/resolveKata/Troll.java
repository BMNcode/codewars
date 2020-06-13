package resolveKata;

public class Troll {
    public static String disemvowel(String str) {
        String regex = "[euioaEUIOA]";
        return str.replaceAll(regex, "");
    }
}
