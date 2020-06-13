package resolveKata;

public class Multiples {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];
        int res = 0;
        for(int i = 0; i < result.length; i++) {
            result[i] = res += n;
        }
        return result;
    }
}
