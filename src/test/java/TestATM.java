import org.junit.Assert;
import org.junit.Test;
import resolveKata.ATM;

public class TestATM {

    @Test
    public void test() {
        Assert.assertEquals(4, new ATM().solve(770));
        Assert.assertEquals(-1, new ATM().solve(125));
        Assert.assertEquals(2, new ATM().solve(550));
        Assert.assertEquals(1, new ATM().solve(10));
        Assert.assertEquals(-1, new ATM().solve(238));
    }
}
