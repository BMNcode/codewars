import org.junit.Assert;
import org.junit.Test;
import resolveKata.NthSeries;

public class TestNthSeries {
    @Test
    public void test() {
        Assert.assertEquals("2.40", NthSeries.seriesSum(59));
    }
}
