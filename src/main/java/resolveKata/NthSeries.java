package resolveKata;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        double result = 1.00;
        double sumStep = 1.00;
        String pattern = "##0.00";
        for (int i = 2; i <= n; i++) {
            sumStep = sumStep + 3;
            result = result + (1/sumStep);
        }
        double scaleResult = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(scaleResult);
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return decimalFormat.format(scaleResult);
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(1));
    }
}
