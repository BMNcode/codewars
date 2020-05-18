import org.junit.Assert;
import org.junit.Test;
import resolveKata.Kata;

public class TestKata {

    @Test
    public void test() {
        Assert.assertEquals("es", Kata.getMiddle("test"));
        Assert.assertEquals("dd", Kata.getMiddle("middle"));
        Assert.assertEquals("t", Kata.getMiddle("testing"));
        Assert.assertEquals("A", Kata.getMiddle("A"));
    }
}
