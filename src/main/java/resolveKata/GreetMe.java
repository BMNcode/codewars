package resolveKata;

public class GreetMe{
    public static String greet(String name){
        String pattern = "Hello %s!";
        char[] nameToChar = name.toLowerCase().toCharArray();
        nameToChar[0] = Character.toUpperCase(nameToChar[0]);
        return String.format(pattern, String.valueOf(nameToChar));
    }
}
