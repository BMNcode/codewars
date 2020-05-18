import org.junit.Assert;
import org.junit.Test;
import resolveKata.KataHighLow;

public class TestKataHighLow {

    @Test
    public void test() {
        Assert.assertEquals("5 1", KataHighLow.highAndLow("1 2 3 4 5"));
        Assert.assertEquals("5 -3", KataHighLow.highAndLow("1 2 -3 4 5"));
        Assert.assertEquals("1 1", KataHighLow.highAndLow("1"));
    }
}
