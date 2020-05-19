import org.junit.Assert;
import org.junit.Test;
import resolveKata.SpinWords;

public class TestSpinWords {
    @Test
    public void test() {
        Assert.assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        Assert.assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}
