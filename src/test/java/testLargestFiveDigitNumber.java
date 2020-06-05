import org.junit.Assert;
import org.junit.Test;
import resolveKata.LargestFiveDigitNumber;

public class testLargestFiveDigitNumber {
    @Test
    public void testLargestFiveDigitNumber() {
        Assert.assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
    }
}
