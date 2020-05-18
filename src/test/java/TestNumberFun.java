import org.junit.Assert;
import org.junit.Test;
import resolveKata.NumberFun;

public class TestNumberFun {

    @Test
    public void test() {
        Assert.assertEquals(144, NumberFun.findNextSquare(121));
        Assert.assertEquals(-1, NumberFun.findNextSquare(114));
    }
}
