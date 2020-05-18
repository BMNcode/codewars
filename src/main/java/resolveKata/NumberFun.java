package resolveKata;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double init = (double) sq;
        double square = Math.sqrt(init);
        long result = -1;
        if(Math.pow(square, 2) == init && square % 1 == 0) {
            result = (long) Math.pow(square + 1, 2);
            return result;
        }
        return result;
    }
}
