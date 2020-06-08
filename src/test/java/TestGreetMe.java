import org.junit.Assert;
import org.junit.Test;
import resolveKata.GreetMe;

public class TestGreetMe {
    @Test
    public void test() {
        Assert.assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }
}
